/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class Vehicle {
    String brand;
    double price;
    
    Vehicle(){System.out.println("Vehicle  Construtor called!");}
    Vehicle(String brand,double price){
    this();
    this.brand=brand;
    this.price=price;
    }
    
    void displayType(){
    System.out.println("This is a vehicle");
    }
}
