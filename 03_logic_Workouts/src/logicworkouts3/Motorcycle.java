/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts3;

/**
 *
 * @author mahmad
 */
public class Motorcycle extends Vehicle{
    Boolean hasCarrier;
    
    Motorcycle(){}
    Motorcycle(Boolean hasCarrier){this.hasCarrier=hasCarrier;}
    
    @Override
    public String toString(){
    return "Id:"+this.getVehicleId()+"Brand:"+this.getBrand()+"Speed:"+this.getSpeed()+"Has Carrier:"+this.hasCarrier;
    }
}
