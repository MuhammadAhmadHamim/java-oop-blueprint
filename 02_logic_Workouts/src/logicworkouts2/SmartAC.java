/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class SmartAC extends SmartDevice{
    float temperature;
    
    SmartAC(){}
    SmartAC(float temperature){
    this.temperature=temperature;
    }
    
    void calculatePowerUsage(){
    this.powerUsage=temperature*2.5f;
    System.out.println("Power used by AC:"+this.powerUsage+" watts");
    }
}
