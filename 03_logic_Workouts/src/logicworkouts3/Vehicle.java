/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts3;

import java.io.Serializable;

/**
 *
 * @author mahmad
 */
public abstract class Vehicle implements Serializable{
    static int counter=0;
    private int vehicleId;
    private String brand;
    private float speed;
    
    Vehicle(){vehicleId=++counter;}
    Vehicle(String brand,float speed){
    this();
    this.brand=brand;
    this.speed=speed;
    }
    void setBrand(String brand){this.brand=brand;}
    void setSpeed(float speed){this.speed=speed;}
    
    String getBrand(){return this.brand;}
    float getSpeed(){return this.speed;}
    int getVehicleId(){return this.vehicleId;}
    
}
