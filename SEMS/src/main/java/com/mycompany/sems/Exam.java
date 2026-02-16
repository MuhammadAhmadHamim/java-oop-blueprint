/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems;

import java.io.Serializable;

/**
 *
 * @author cr7hi
 */
public class Exam implements Serializable{
    Course course;
    int totalMarks;
    int obtainedMarks;
    
    Exam(){}
    Exam(Course course,int totalMarks,int obtainedMarks){
    this.course=course;
    this.totalMarks=totalMarks;
    this.obtainedMarks=obtainedMarks;
    }
    
    public void calculateResult(){
    float total;
    try{
    if(this.obtainedMarks<0 || this.obtainedMarks>this.totalMarks){
    throw new InvalidMarksException("Invalid Marks!");
    }
    else{
    total=(obtainedMarks/totalMarks)*100;
    System.out.println("Percentage: "+total+"%");}
    }catch(InvalidMarksException ime){
        ime.printStackTrace();
    }}
}
