/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.labfinal;

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
 * @author mahmad
 */
public class DataStore<T>{
    public ArrayList<T> a1;
    
    DataStore(){a1=new ArrayList();}
   
   public ArrayList<T> getList(){
   return a1;
   }
   public void saveToFile(String filename){
   try(FileOutputStream fos=new FileOutputStream(filename);
       ObjectOutputStream oos=new ObjectOutputStream(fos);){
    for(T t:a1){
        oos.writeObject(t);
    }
    System.out.println("Data successfully written!");
   }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
   }
   public void loadFromFile(String filename){
   try(FileInputStream fis=new FileInputStream(filename);
       ObjectInputStream ois=new ObjectInputStream(fis);){
       while(true){
       try{
           T t=(T) ois.readObject();
       a1.add(t);
       System.out.println(t.toString());
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
