/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems;

/**
 *
 * @author cr7hi
 */
public abstract class Person {
    static int counter=0;
    private int id;
    private String name;
    
    Person(){
        this.id=++counter;
    }
    Person(String name){
        this();
        this.name=name;
    }
    
    int getId(){return this.id;}
    String getName(){return this.name;}
    
    void setName(String name){this.name=name;}
    public abstract void getRoleDescription();
    public final void displayBasicInfo(){
    System.out.println("Name:"+this.name);
    System.out.println("Id:"+this.id);
    }
}
