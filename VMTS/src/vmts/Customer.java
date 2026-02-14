/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vmts;

/**
 *
 * @author cr7hi
 */
public class Customer extends Human{
    private static int counter=1;
    private int customerID=counter;
    private String email;
    private boolean isOwner;
    private String registrationDate;
    
    Customer(){counter++;
    }
    Customer(String email,boolean isOwner,String registrationDate){
    super("Ali",19,"Male",0000000000,"Wah",23364365);
    counter++;
    this.registrationDate=registrationDate;
    this.email=email;
    this.isOwner=isOwner;
    }
    
    void setEmail(String email){this.email=email;}
    String getEmail(){return this.email;}
    
    void setisOwner(boolean isOwner){this.isOwner=isOwner;}
    boolean getisOwner(){return this.isOwner;}
    
    void setRegistrationDate(String registrationDate){this.registrationDate=registrationDate;}
    String getRegistrationDate(){return this.registrationDate;}
    
    int getCustomerID(){return this.customerID;}
    
    void displayinfo(){
    super.displayinfo();
    System.out.println("CustomerID:"+this.customerID);
    System.out.println("Email:"+this.email);
    System.out.println("IsOwner:"+this.isOwner);
    System.out.println("RegistrationDate:"+this.registrationDate);
    }
}
