/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vmts;

/**
 *
 * @author cr7hi
 */
public class Human {
    private String name;
    private int age;
    private String gender;
    private int contactNumber;
    private String address;
    private int nationalID;
    
    Human(){
    }
    Human(String name,int age,String gender,int contactNumber,String address,int nationalID){
    this.name=name;
    this.age=age;
    this.contactNumber=contactNumber;
    this.address=address;
    this.gender=gender;
    this.nationalID=nationalID;
    }
    Human(Human h1){
    this.name=h1.getName();
    this.age=h1.age;
    this.contactNumber=h1.getContactNumber();
    this.address=h1.getAddress();
    this.gender=h1.getGender();
    this.nationalID=h1.getNationalID();
    }
    
    void setName(String name){this.name=name;}
    String getName(){return this.name;}
    
    void setAge(int age){this.age=age;}
    int getAge(){return this.age;}
    
    void setContactNumber(int contactNumber){this.contactNumber=contactNumber;}
    int getContactNumber(){return this.contactNumber;}
    
    void setAddress(String address){this.address=address;}
    String getAddress(){return this.address;}
    
    void setGender(String gender){this.gender=gender;}
    String getGender(){return this.gender;}
    
    void setNationalID(int nationalID){this.nationalID=nationalID;}
    int getNationalID(){return this.nationalID;}
    
    void displayinfo(){
    System.out.println("Name:"+this.name);
    System.out.println("Age:"+this.age);
    System.out.println("Gender:"+this.gender);
    System.out.println("ContactNumber:"+this.contactNumber);
    System.out.println("NationalID:"+this.nationalID);
    System.out.println("Address:"+this.address);
    }
}
