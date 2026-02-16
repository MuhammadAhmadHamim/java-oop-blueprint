package com.mycompany.sems;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.*;


/**
 * JavaFX App
 */
public class App extends Application {
   ResultManager<Student> rms=new ResultManager();
   ResultManager<Exam> rme=new ResultManager();
    @Override
    public void start(Stage stage) {
        TextField tfname=new TextField();
        tfname.setPromptText("Name");
        TextField tfreg=new TextField();
        tfreg.setPromptText("reg#");
        TextField tfgpa=new TextField();
        tfgpa.setPromptText("GPA");
        TextField tfcourseCode=new TextField();
        tfcourseCode.setPromptText("Course code");
        TextField tfcourseTitle=new TextField();
        tfcourseTitle.setPromptText("Course title");
        TextField tfcreditHours=new TextField();
        tfcreditHours.setPromptText("Credit hours");
        TextField tfobtainedmarks=new TextField();
        tfobtainedmarks.setPromptText("Obtained marks");
        TextField tftotalmarks=new TextField();
        tftotalmarks.setPromptText("Total marks");
        
        Button b1 =new Button("Add Student");
        Button b2 =new Button("Add Exam");
        Button b3 =new Button("Save Data");
        Button b4 =new Button("Load Data");
        
        b1.setOnAction(e->{
        Person p=new Student(tfname.getText(),Integer.parseInt(tfreg.getText()),Double.parseDouble(tfgpa.getText()));
        Student s=(Student) p;
        rms.addObject(s);
        });
        b2.setOnAction(e->{
        Course c=new Course(Integer.parseInt(tfcourseCode.getText()),tfcourseTitle.getText(),Integer.parseInt(tfcreditHours.getText()));
        Exam exam = new Exam(c,Integer.parseInt(tfobtainedmarks.getText()),Integer.parseInt(tfobtainedmarks.getText()));
        rme.addObject(exam);
        });
        b3.setOnAction(e->{
        rms.saveToFile("Student.dat");
        rme.saveToFile("Exam.dat");
        });
        b4.setOnAction(e->{
        rms.loadFromFile("Student.dat");
        for(Student s:rms.a1){
        s.getRoleDescription();
        }
        rme.loadFromFile("Exam.dat");
        for(Exam exam:rme.a1){
        exam.calculateResult();
        }
        });
        HBox h1=new HBox(25);
        h1.setPadding(new Insets(30));
        h1.setAlignment(Pos.CENTER);
        h1.getChildren().addAll(b1,b2,b3,b4);
        VBox v1=new VBox(25);
        v1.setPadding(new Insets(30));
        v1.getChildren().addAll(tfname,tfreg,tfgpa,tfcourseCode,tfcourseTitle,tfcreditHours,tfobtainedmarks,tftotalmarks,h1);
        Scene scene=new Scene(v1,400,600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}