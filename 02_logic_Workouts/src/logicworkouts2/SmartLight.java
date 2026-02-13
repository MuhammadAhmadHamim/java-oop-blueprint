/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class SmartLight extends SmartDevice{
    float brightness;
    
    SmartLight(){}
    SmartLight(float brightness){
    this.brightness=brightness;
    }
    
    void calculatePowerUsage(){
    this.powerUsage=brightness*0.8f;
    System.out.println("Power used by Light:"+this.powerUsage+" watts");
    }
}
