/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sems;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author cr7hi
 */
public class ResultManager<R>{
    ArrayList<R> a1=new ArrayList<>();
    
    public void addObject(R r){
    a1.add(r);
    }
    public void searchObject(R r){
    boolean found=false;
    for(R r1:a1){
    if(r1.equals(r)){
    found=true;}
    else{
    continue;
    }
    }
    if(found){System.out.println("Object Found!");}
    else{System.out.println("Object not Found!");}
    }
    public void saveToFile(String filePath){
    try(FileOutputStream fos=new FileOutputStream(filePath);
       ObjectOutputStream oos=new ObjectOutputStream(fos);){
    for(R r:a1){
        oos.writeObject(r);
    }
    System.out.println("Data successfully written!");
   }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void loadFromFile(String filename){
        a1=null;
   try(FileInputStream fis=new FileInputStream(filename);
       ObjectInputStream ois=new ObjectInputStream(fis);){
       while(true){
       try{
           R r=(R) ois.readObject();
       a1.add(r);
       }catch(EOFException e){
           break;
       }
       }
    System.out.println("Data successfully restored!");
   }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
   }
    
    }
