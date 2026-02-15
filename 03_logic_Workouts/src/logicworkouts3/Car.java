/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts3;

/**
 *
 * @author mahmad
 */
public class Car extends Vehicle{
    static int numDoors=4;
    
    Car(){}
    @Override
    public String toString(){
    return "Id:"+this.getVehicleId()+"Brand:"+this.getBrand()+"Speed:"+this.getSpeed()+"Number of Doors:"+Car.numDoors;
    }
}
