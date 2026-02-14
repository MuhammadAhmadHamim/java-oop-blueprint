/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vmts;

/**
 *
 * @author cr7hi
 */
public class Car extends Vehicle{
    private String fuelType;
    private static int seatingCapacity=4;
    private String transmissionType;
    Tracker t;
    
    Car(){
        super();
        t=new Tracker();
    }
    Car(String fuelType,String transmissionType,String currentLocation,String lastUpdated,boolean isActive){
    this();
    this.fuelType=fuelType;
    this.transmissionType=transmissionType;
    this.t.setCurrentLocation(currentLocation);
    this.t.setLastUpdated(lastUpdated);
    this.t.setIsActive(isActive);
    }
    Car(Car c1){
    this.fuelType=c1.getFuelType();
    this.transmissionType=c1.getTransmissionType();
    this.t.setCurrentLocation(c1.t.getCurrentLocation());
    this.t.setLastUpdated(c1.t.getLastUpdated());
    this.t.setIsActive(c1.t.getIsActive());
    }
    
    void setFuelType(String fuelType){this.fuelType=fuelType;}
    String getFuelType(){return this.fuelType;}
    
    void setTransmissionType(String transmissionType){this.transmissionType=transmissionType;}
    String getTransmissionType(){return this.transmissionType;}
    
    int getSeatingCapacity(){return this.seatingCapacity;}
    
    void displayinfo(){
    super.displayinfo();
    System.out.println("Fueltype:"+this.fuelType);
    System.out.println("TransmissionType:"+this.transmissionType);
    System.out.println("SeatingCapacity:"+this.seatingCapacity);
    t.displayinfo();
    }
}
