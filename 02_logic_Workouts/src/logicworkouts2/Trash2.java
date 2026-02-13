/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicworkouts2;

import java.util.ArrayList;

/**
 *
 * @author cr7hi
 */
public class Trash2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SmartDevice[] sm=new SmartDevice[10];
        //SmartLight
        sm[0]=new SmartLight(300.56f);
        sm[0].DeviceName="Light1";
        sm[0].turnON();
        sm[0].calculatePowerUsage();
        sm[0].t.hours=5;
        sm[0].t.calculateTotalenergy(sm[0].powerUsage);
        sm[0].turnOFF();
        System.out.println();
        
        //SmartFan
        sm[1]=new SmartFan(90.4f);
        sm[1].DeviceName="Fan1";
        sm[1].turnON();
        sm[1].calculatePowerUsage();
        sm[1].t.hours=8;
        sm[1].t.calculateTotalenergy(sm[1].powerUsage);
        sm[1].turnOFF();
        System.out.println();
        
        //SmartAC
        sm[2]=new SmartAC(25.3f);
        sm[2].DeviceName="AC1";
        sm[2].turnON();
        sm[2].calculatePowerUsage();
        sm[2].t.hours=12;
        sm[2].t.calculateTotalenergy(sm[2].powerUsage);
        sm[2].turnOFF();
        System.out.println();
        
    }
    
}
