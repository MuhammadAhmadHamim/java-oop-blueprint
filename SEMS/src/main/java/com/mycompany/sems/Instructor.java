/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems;

/**
 *
 * @author cr7hi
 */
public class Instructor extends Person{
    
    String department;
    Course course;
    
    Instructor(){}
    Instructor(String name,String department,Course course){
    super(name);
    this.department=department;
    this.course=course;
    }
    
    void assignCourse(Course course){
    if(this.course!=null){this.course=course;}
    else{System.out.println("Course already assigned!");}
    }
    
    @Override
    public void getRoleDescription() {
    super.displayBasicInfo();
    System.out.println("Department:"+this.department);
    this.course.displayCourseInfo();
    }
}
