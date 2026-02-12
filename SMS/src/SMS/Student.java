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
public class Student {
    int rollNo;
    String name;
    int age;
    String department;
    static int studentCounter;
    
    Student(String name){
        this();
        this.name=name;
    }
    Student(Student std){
        this();
        this.rollNo=std.rollNo;
        this.name=std.name;
        this.age=std.age;
        this.department=std.department;
    }
    Student(){
        studentCounter++;
        
    }
    
    void updateStudentDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of the student:");
        name=sc.nextLine();
        System.out.println("Enter the rollNo of the student:");
        rollNo=sc.nextInt();
        System.out.println("Enter the age of the student(in years):");
        age=sc.nextInt();
        System.out.println("Enter the department of the student:");
        sc.nextLine();
        department=sc.nextLine();
    }
    
    void showStudentDetails(){
        System.out.println("Name of the student:"+name);
        System.out.println("Rollno of the student:"+rollNo);
        System.out.println("Age of the student:"+age);
        System.out.println("Department of the student:"+department);
    }
    static void TotalStudents(){
        System.out.println("Current count of the Student:"+studentCounter);
    }
}