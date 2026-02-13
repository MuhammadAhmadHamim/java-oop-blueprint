/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class SmartFan extends SmartDevice{
    float speed;
    
    SmartFan(){}
    SmartFan(float speed){
    this.speed=speed;
    }
    
    void calculatePowerUsage(){
    this.powerUsage=speed*1.5f;
    System.out.println("Power used by Fan:"+this.powerUsage+" watts");
    }
}
