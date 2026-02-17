package com.mycompany.ums;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.io.*;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Course Registration System");
        
        VBox root = new VBox(15);
        root.setPadding(new Insets(20));
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: linear-gradient(to bottom, #667eea 0%, #764ba2 100%);");
        
        Button btnStudent = new Button("Register Student");
        Button btnCourse = new Button("Register Course");
        Button btnAssign = new Button("Assign Course to Student");
        Button btnShow = new Button("Show Results");
        
        String buttonStyle = "-fx-background-color: white; " +
                           "-fx-text-fill: #667eea; " +
                           "-fx-font-size: 14px; " +
                           "-fx-font-weight: bold; " +
                           "-fx-padding: 12 24; " +
                           "-fx-background-radius: 8; " +
                           "-fx-cursor: hand; " +
                           "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.2), 10, 0, 0, 2);";
        
        String buttonHoverStyle = "-fx-background-color: #f0f0f0; " +
                                "-fx-text-fill: #667eea; " +
                                "-fx-font-size: 14px; " +
                                "-fx-font-weight: bold; " +
                                "-fx-padding: 12 24; " +
                                "-fx-background-radius: 8; " +
                                "-fx-cursor: hand; " +
                                "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.3), 12, 0, 0, 3);";
        
        btnStudent.setStyle(buttonStyle);
        btnCourse.setStyle(buttonStyle);
        btnAssign.setStyle(buttonStyle);
        btnShow.setStyle(buttonStyle);
        
        btnStudent.setPrefWidth(280);
        btnCourse.setPrefWidth(280);
        btnAssign.setPrefWidth(280);
        btnShow.setPrefWidth(280);
        
        btnStudent.setOnMouseEntered(e -> btnStudent.setStyle(buttonHoverStyle));
        btnStudent.setOnMouseExited(e -> btnStudent.setStyle(buttonStyle));
        btnCourse.setOnMouseEntered(e -> btnCourse.setStyle(buttonHoverStyle));
        btnCourse.setOnMouseExited(e -> btnCourse.setStyle(buttonStyle));
        btnAssign.setOnMouseEntered(e -> btnAssign.setStyle(buttonHoverStyle));
        btnAssign.setOnMouseExited(e -> btnAssign.setStyle(buttonStyle));
        btnShow.setOnMouseEntered(e -> btnShow.setStyle(buttonHoverStyle));
        btnShow.setOnMouseExited(e -> btnShow.setStyle(buttonStyle));
        
        root.getChildren().addAll(btnStudent, btnCourse, btnAssign, btnShow);
        
        btnStudent.setOnAction(e -> registerStudent());
        btnCourse.setOnAction(e -> registerCourse());
        btnAssign.setOnAction(e -> assignCourse());
        btnShow.setOnAction(e -> showResults());
        
        Scene scene = new Scene(root, 400, 350);
        stage.setScene(scene);
        stage.show();
    }
    
    private void registerStudent() {
        TextInputDialog dialog1 = new TextInputDialog();
        dialog1.setTitle("Student Registration");
        dialog1.setHeaderText("Enter Student ID:");
        dialog1.setContentText("ID:");
        styleDialog(dialog1);
        
        String id = dialog1.showAndWait().orElse(null);
        if (id == null || id.trim().isEmpty()) return;
        
        TextInputDialog dialog2 = new TextInputDialog();
        dialog2.setTitle("Student Registration");
        dialog2.setHeaderText("Enter Student Name:");
        dialog2.setContentText("Name:");
        styleDialog(dialog2);
        
        String name = dialog2.showAndWait().orElse(null);
        if (name == null || name.trim().isEmpty()) return;
        
        Student s = new Student(id, name);
        writeToFile("students.txt", s.toString());
    }
    
    private void registerCourse() {
        TextInputDialog dialog1 = new TextInputDialog();
        dialog1.setTitle("Course Registration");
        dialog1.setHeaderText("Enter Course Code:");
        dialog1.setContentText("Code:");
        styleDialog(dialog1);
        
        String code = dialog1.showAndWait().orElse(null);
        if (code == null || code.trim().isEmpty()) return;
        
        TextInputDialog dialog2 = new TextInputDialog();
        dialog2.setTitle("Course Registration");
        dialog2.setHeaderText("Enter Course Title:");
        dialog2.setContentText("Title:");
        styleDialog(dialog2);
        
        String title = dialog2.showAndWait().orElse(null);
        if (title == null || title.trim().isEmpty()) return;
        
        Course c = new Course(code, title);
        writeToFile("courses.txt", c.toString());
    }
    
    private void assignCourse() {
        TextInputDialog dialog1 = new TextInputDialog();
        dialog1.setTitle("Assign Course");
        dialog1.setHeaderText("Enter Student ID:");
        dialog1.setContentText("Student ID:");
        styleDialog(dialog1);
        
        String studentId = dialog1.showAndWait().orElse(null);
        if (studentId == null || studentId.trim().isEmpty()) return;
        
        TextInputDialog dialog2 = new TextInputDialog();
        dialog2.setTitle("Assign Course");
        dialog2.setHeaderText("Enter Course Code:");
        dialog2.setContentText("Course Code:");
        styleDialog(dialog2);
        
        String courseCode = dialog2.showAndWait().orElse(null);
        if (courseCode == null || courseCode.trim().isEmpty()) return;
        
        Enrollment e = new Enrollment(studentId, courseCode);
        writeToFile("enrollments.txt", e.toString());
    }
    
    private void showResults() {
        TextArea area = new TextArea();
        area.setEditable(false);
        area.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 12px;");
        readFile("enrollments.txt", area);
        
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Enrollment Results");
        alert.setHeaderText("Current Enrollments:");
        alert.getDialogPane().setContent(area);
        alert.getDialogPane().setPrefSize(500, 400);
        styleAlert(alert);
        alert.showAndWait();
    }
    
    private void writeToFile(String fileName, String data) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName, true))) {
            pw.println(data);
        } catch (IOException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("File Error!");
            alert.setContentText("Could not write to file: " + fileName);
            styleAlert(alert);
            alert.showAndWait();
        }
    }
    
    private void readFile(String fileName, TextArea area) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                area.appendText(line + "\n");
            }
        } catch (IOException ex) {
            area.setText("No data found.");
        }
    }
    
    private void styleDialog(Dialog<?> dialog) {
        DialogPane dialogPane = dialog.getDialogPane();
        dialogPane.setStyle("-fx-background-color: #f5f5f5;");
    }
    
    private void styleAlert(Alert alert) {
        DialogPane dialogPane = alert.getDialogPane();
        dialogPane.setStyle("-fx-background-color: #f5f5f5;");
    }

    public static void main(String[] args) {
        launch();
    }

}