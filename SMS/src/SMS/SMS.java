/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SMS;

/**
 *
 * @author cr7hi
 */
public class SMS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Objects and methods for Student class
        Student s1=new Student("Ali");
        Student s2=new Student(s1);
        s1.showStudentDetails();
        System.out.println();
        s2.showStudentDetails();
        Student.TotalStudents();
        System.out.println();
        
        //Objects and methods for Department class
        Department d1=new Department(123);
        Department d2=new Department(d1);
        d1.PrintDepartment();
        System.out.println();
        d2.PrintDepartment();
        System.out.println();
        
        //Objects and methods for Course class
        Course c1=new Course("CSC102");
        Course c2=new Course(3,"ICT","Sir Bilal");
        c1.showCourseDetails();
        System.out.println();
        c2.showCourseDetails();
        System.out.println();
    }    
}
