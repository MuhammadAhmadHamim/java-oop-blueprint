package com.mycompany.labfinal;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {
private DataStore<InventoryItem> dsii=new DataStore();
private DataStore<Product> dsp=new DataStore();
    @Override
    public void start(Stage stage) {
        stage.setTitle("Inventory Management System");
        TextField tfID=new TextField();
        tfID.setPromptText("ProductID");
        TextField tfTitle=new TextField();
        tfTitle.setPromptText("Product Title");
        TextField tfItemID=new TextField();
        tfItemID.setPromptText("ItemID");
        TextField tfQuantity=new TextField();
        tfQuantity.setPromptText("Quantity");
        Button b1=new Button("AddStock");
        Button b2=new Button("SaveData");
        Button b3=new Button("LoadData");
        b1.setOnAction(e->{
        Product p1=new Product(Integer.parseInt(tfID.getText()),tfTitle.getText());
        InventoryItem ii1=new InventoryItem(Integer.parseInt(tfID.getText()),tfTitle.getText(),
                Integer.parseInt(tfItemID.getText()),Integer.parseInt(tfQuantity.getText()));
        tfID.clear();tfTitle.clear();
        tfItemID.clear();tfQuantity.clear();
        Boolean productFound=false;
        for(Product p:dsp.a1){
        if(p.productId==p1.productId){
           int index=dsp.a1.indexOf(p);
        dsp.a1.set(index, p1);
        productFound=true;
        }
        else{
        continue;
        }
        }
        if(productFound){
            System.out.println("Product successfully reused!");
        }
        else{
            dsp.a1.add(p1);
            System.out.println("Product successfully added!");
        }
        Boolean Itemfound=false;
        for(InventoryItem i:dsii.a1){
        if(i.ItemID==ii1.ItemID){
           int index=dsii.a1.indexOf(i);
        dsii.a1.set(index, ii1);
        Itemfound=true;
        }
        else{
        continue;
        }
        }
        if(Itemfound){
            System.out.println("Item successfully reused!");
        }
        else{
            dsii.a1.add(ii1);
            System.out.println("Item successfully added!");}
        });
        b2.setOnAction(e->{
        dsii.saveToFile("InventoryItem.dat");
        dsp.saveToFile("Product.dat");
        });
        b3.setOnAction(e->{
        dsp.loadFromFile("Product.dat");
        dsii.loadFromFile("InventoryItem.dat");
        });
        b1.setStyle("-fx-font-weight: bold ;-fx-padding:8;");
        b2.setStyle("-fx-font-weight: bold ;-fx-padding:8;");
        b3.setStyle("-fx-font-weight: bold ;-fx-padding:8;");
        HBox h1=new HBox(15);
        h1.setPadding(new Insets(25));
        h1.getChildren().addAll(b1,b2,b3);
        h1.setAlignment(Pos.CENTER);
        VBox v1=new VBox(15);
        v1.setPadding(new Insets(25));
        v1.getChildren().addAll(tfID,tfTitle,tfItemID,tfQuantity,h1);
        v1.setStyle("-fx-padding:8;");
        Scene scene=new Scene(v1,500,600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}