/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author cr7hi
 */
public class Student extends Person implements Serializable{
    int reg;
    ArrayList<Course> ac=new ArrayList<>();
    double gpa;
    
    Student(){}
    Student(String name,int reg,double gpa){
    super(name);
    this.reg=reg;
    this.gpa=gpa;
    }

    @Override
    public void getRoleDescription() {
    super.displayBasicInfo();
    System.out.println("Reg#:"+this.reg);
    System.out.println("GPA:"+this.gpa);
    }
    
    int getReg(){return this.reg;}
    void setReg(int reg){this.reg=reg;}
    double getGPA(){return this.gpa;}
    void setGPA(double gpa){this.gpa=gpa;}
    
    void addCourse(Course course){ac.add(course);}
}
