/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class Account {
    private String accountNumber;
    private double balance;
    private String accountHolderName;
    
    Account(){}
    Account(String accountNumber,double balance,String accountHolderName){
    this.accountHolderName=accountHolderName;
    this.accountNumber=accountNumber;
    this.balance=balance;}
    
    void setBalance(double balance){this.balance=balance;}
    double getBalance(){return this.balance;}
    
    void deposit(double amount){
    this.balance+=amount;}
    void withdraw(double amount){
    if(balance-amount<0){
    System.out.println("Sorry,Not Enough Balance!");}
    else{
    this.balance-=amount;
    }
    }
}