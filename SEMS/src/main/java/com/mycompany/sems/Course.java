/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems;

/**
 *
 * @author cr7hi
 */
public class Course {
    
    private int courseCode;
    private String courseTitle;
    private int creditHours;
    
    Course(){}
    Course(int courseCode,String courseTitle,int creditHours){
    this.courseCode=courseCode;
    this.courseTitle=courseTitle;
    this.creditHours=creditHours;
    }
    
    int getcourseCode(){return this.courseCode;}
    void setcourseCode(int courseCode){this.courseCode=courseCode;}
    int getcreditHours(){return this.creditHours;}
    void setcreditHours(int creditHours){this.creditHours=creditHours;}
    String getcourseTitle(){return this.courseTitle;}
    void setcourseTitle(String courseTitle){this.courseTitle=courseTitle;}
    
    public void displayCourseInfo(){
    System.out.println("Course code:"+this.courseCode);
    System.out.println("Course title:"+this.courseTitle);
    System.out.println("Credit hours:"+this.creditHours);    
    }
}
