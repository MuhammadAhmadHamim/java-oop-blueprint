/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class Timer {
    int hours;
    float totalEnergy;
    
    Timer(){}
    Timer(int hours){
    this.hours=hours;}
    
    void calculateTotalenergy(float powerUsage){
    this.totalEnergy=this.hours*powerUsage;
    System.out.println("Total energy Consumed:"+totalEnergy +" watts");
    }
}
