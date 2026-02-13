/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class Bike extends Vehicle{
    String fuelType;
    
    Bike(){}
    Bike(String fuelType){
    super("Honda",25000000);
    this.fuelType=fuelType;
    System.out.println("Car Construtor called!");
    }
    
    void displayType(){
    System.out.println("This is a Bike");
    }
}
