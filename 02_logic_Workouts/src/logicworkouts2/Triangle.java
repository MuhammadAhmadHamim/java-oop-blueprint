/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
public class Triangle extends Shape{
    float l;
    float w;
    
    void calculateArea(){
    this.area=(l*w)/2;
    System.out.println("Area of triangle!");
    } 
}
