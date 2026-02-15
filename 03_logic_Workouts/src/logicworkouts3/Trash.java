/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logicworkouts3;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author mahmad
 */
public class Trash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        /* TODO code application logic here
        ArrayList<Vehicle> a1=new ArrayList<>();
        ArrayList<Vehicle> a2=new ArrayList<>();
        Vehicle v1=new Car();
        Vehicle v2=new Motorcycle(true);
        Vehicle v3=new Car();
        Vehicle v4=new Motorcycle(false);
        a1.add(v1);
        a1.add(v2);
        a1.add(v3);
        a1.add(v4);
        try(FileOutputStream fos=new FileOutputStream("vehicle.dat");
        ObjectOutputStream Oos=new ObjectOutputStream(fos);){
        for(Vehicle v:a1){
        Oos.writeObject(v);
        System.out.println("Object saved!");
        }
        }catch(IOException e){
            e.printStackTrace();}
        
        try(FileInputStream fin=new FileInputStream("vehicle.dat");
            ObjectInputStream ois=new ObjectInputStream(fin);){
        while(true){
            try{
            a2.add((Vehicle)ois.readObject());}catch(EOFException e){break;}}
        }catch(FileNotFoundException e){e.printStackTrace();}
        catch(ClassNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        for(Vehicle v:a1){System.out.println(v.toString());}
        */
        try(FileOutputStream fos=new FileOutputStream("test.txt");){
        String s="Alternatively, a common practice is to write an entire collection (e.g., List, Set) to the";
        byte[] b=s.getBytes();
        fos.write(b);
        System.out.println("File wrote successfully!");
        }catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
        try(FileInputStream fin=new FileInputStream("test.txt");){
        while(true){
        int i=fin.read();
        if(i!=-1){
        System.out.print((char)i);}
        else{break;}
        }
        }catch(FileNotFoundException e){e.printStackTrace();}
        catch(IOException e){e.printStackTrace();}
    }
    
}
