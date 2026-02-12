/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMS;
import java.util.Scanner;
/**
 *
 * @author cr7hi
 */
public class Course {
    String courseCode;
    String courseName;
    int creditHours;
    String courseTeacher;
    
    Course(String courseCode){
        this(4,"Object Oriented Programming","Sir Nadeem");
        this.courseCode=courseCode;
    }
    Course(int creditHours,String courseName,String courseTeacher){
        this.creditHours=creditHours;
        this.courseName=courseName;
        this.courseTeacher=courseTeacher;
    }
    
    void updateCourseDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Code of the course:");
        courseCode=sc.nextLine();
        System.out.println("Enter the Name of the course:");
        sc.nextLine();
        courseName=sc.nextLine();
        System.out.println("Enter the CreditHours of the course:");
        creditHours=sc.nextInt();
        System.out.println("Enter the Teacher of the course:");
        sc.nextLine();
        courseTeacher=sc.nextLine();
    }
    
    void showCourseDetails(){
        System.out.println("Name of the course Teacher:"+courseTeacher);
        System.out.println("Name of the Course:"+courseName);
        System.out.println("CreditHours of the Course:"+creditHours);
        System.out.println("Code of the course:"+courseCode);
    }
}
