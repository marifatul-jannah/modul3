/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Thole
 */
public class Praktikum1 implements Serializable{
    private final String firstName;
    private final String lastName;
    private final int age;
    

    public Praktikum1(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void printData(){
        System.out.println("Nama\t : " + firstName + " " + lastName);
        System.out.println("Usia\t : " + age);        
    }
    
    public void saveObject(Praktikum1 Obj){
        try {
            FileOutputStream fos = new FileOutputStream("data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Obj);
            oos.flush();
            fos.close();
        } catch (IOException ioe) {
            System.out.println("a problem acured during deserialize.\n" + ioe.getMessage());
        }
    }
    
    public void readObject(Praktikum1 Obj){
        try {
            FileInputStream fis = new FileInputStream("data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Obj = (Praktikum1) ois.readObject();
            Obj.printData();
            fis.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("a problem acurated during deserialize.\n" + ex);
            System.exit(1);
        }
    }
    public static void main(String[] args) {
        Praktikum1 is = new Praktikum1("dee","aja",22);
        is.readObject(is);
        is.saveObject(is);
    }
    
}
