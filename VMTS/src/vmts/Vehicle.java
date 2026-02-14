/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vmts;

/**
 *
 * @author cr7hi
 */
public class Vehicle {
    private static int counter=1;
    private int vehicleID=counter;
    private String model;
    private String manufacture;
    private int yearofManufacture;
    private String registrationDate;
    private boolean isAvailable;
    
    Vehicle(){
        counter++;
    }
    Vehicle(String model,String manufacture,int yearofManufacture,String registrationDate,boolean isAvailable){
    this();
    this.model=model;
    this.manufacture=manufacture;
    this.yearofManufacture=yearofManufacture;
    this.registrationDate=registrationDate;
    this.isAvailable=isAvailable;
    }
    
    
    void setModel(String model){this.model=model;}
    String getModel(){return this.model;}
    
    void setManufacture(String manufacture){this.manufacture=manufacture;}
    String getManufacture(){return this.manufacture;}
    
    void setRegistrationDate(String registrationDate){this.registrationDate=registrationDate;}
    String getRegistrationDate(){return this.registrationDate;}
    
    void setisAvailable(boolean isAvailable){this.isAvailable=isAvailable;}
    boolean getisAvailable(){return this.isAvailable;}
    
    int getVehicleID(){return this.vehicleID;}
    
    void setYearofManufacture(int yearofManufacture){this.yearofManufacture=yearofManufacture;}
    int getYearofManufacture(){return this.yearofManufacture;}
    
    void displayinfo(){
    System.out.println("VehicleID:"+this.vehicleID);
    System.out.println("Model:"+this.model);
    System.out.println("Manufacture:"+this.manufacture);
    System.out.println("Year of Manufacture:"+this.yearofManufacture);
    System.out.println("Registration Date:"+this.registrationDate);
    System.out.println("Availability:"+this.isAvailable);
    }
}
