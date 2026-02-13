/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicworkouts2;

/**
 *
 * @author cr7hi
 */
abstract public  class Shape {
    String colour;
    double area;
    
    abstract void calculateArea();
    void displayInfo(){
    System.out.println("Colour:"+this.colour);
    System.out.println("Area:"+this.area);}
}
