/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vmts;

/**
 *
 * @author cr7hi
 */
public class Tracker {
    static int counter=1;
    private int trackerID=counter;
    private String currentLocation;
    private boolean isActive;
    private String lastUpdated;
    
    Tracker(){counter++;
    }
    Tracker(String currentLocation,boolean isActive,String lastUpdated){
    this();
    this.currentLocation=currentLocation;
    this.lastUpdated=lastUpdated;
    this.isActive=isActive;
    }
    
    void setCurrentLocation(String currentLocation){this.currentLocation=currentLocation;}
    String getCurrentLocation(){return this.currentLocation;}
    
    void setLastUpdated(String lastUpdated){this.lastUpdated=lastUpdated;}
    String getLastUpdated(){return this.lastUpdated;}
    
    int getTrackerID(){return this.trackerID;}
    
    void setIsActive(boolean isActive){this.isActive=isActive;}
    boolean getIsActive(){return this.isActive;}
    
    void displayinfo(){
    System.out.println("TrackerID:"+this.trackerID);
    System.out.println("LastUpdated:"+this.lastUpdated);
    System.out.println("isActive:"+this.isActive);
    System.out.println("CurrentLocation:"+this.currentLocation);
    }
}
