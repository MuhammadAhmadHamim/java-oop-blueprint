/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
abstract public class SmartDevice {
    String DeviceName;
   private  boolean statusIsON;
   protected float powerUsage;
    Timer t;
    SmartDevice(){t=new Timer();}
    SmartDevice(String DeviceName,boolean statusIsON,float powerUsage){
    this();
    this.DeviceName=DeviceName;
    this.powerUsage=powerUsage;
    this.statusIsON=statusIsON;
    }
    
    void turnON(){
    this.statusIsON=true;
    System.out.println("Device turned ON!");
    }
    
    void turnOFF(){
    this.statusIsON=false;
    System.out.println("Device turned OFF!");
    }
    
    abstract void calculatePowerUsage();
}
