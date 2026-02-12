/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SMS;

/**
 *
 * @author cr7hi
 */
public class Department {
    int deptId;
    String deptName;
    static int totalDepartment;
    
    Department(int deptId){
        this();
        this.deptId=deptId;
    }
    Department(Department d){
        this();
        this.deptId=d.deptId;
        this.deptName=d.deptName;
    }
    Department(){
        totalDepartment++;
    }
    void PrintDepartment(){
        System.out.println("Department name:"+deptName);
        System.out.println("Department ID:"+deptId);
    }
}
