/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vmts;
import java.util.Scanner;
/**
 *
 * @author cr7hi
 */
public class VMTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c;
        
        Car c1;
        c1=new Car("Petrol","Manual","Wah","Wah",false);
        
        Customer cu1;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1)Register a new Customer");
        System.out.println("2)Add a new Car");
        System.out.println("3)Update Location");
        System.out.println("4)View Tracker info");
        System.out.println("5)Deactivate tracker");
        
        c=sc.nextInt();
        sc.nextLine();
        System.out.println();
        
        if(c==1){
        cu1=new Customer("iam--------@gmail.com",true,"20/09/2025");
        cu1.displayinfo();
        }
        
        else if(c==2){
        c1.displayinfo();}
        
        else if(c==3){
        System.out.println("Enter the Updated location:");
        String l;
        l=sc.nextLine();
        c1.t.setLastUpdated(c1.t.getCurrentLocation());
        c1.t.setCurrentLocation(l);
        System.out.println("Current Location: " + c1.t.getCurrentLocation());
        System.out.println("Last Updated: " + c1.t.getLastUpdated());}
        
        else if(c==4){
            c1.t.displayinfo();
        }
        
        else if(c==5){
            c1.t=null;
        System.out.println("Tracker Deactivated!");}
        else{System.out.println("Invalid Input!");}
    }
    
}
