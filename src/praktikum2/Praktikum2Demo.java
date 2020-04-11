/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author Thole
 */
public class Praktikum2Demo {
    public void praktikum(List<Praktikum2> pList, String fileName){
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))){
            out.writeObject(pList);
        } catch (IOException ex) {
            System.out.println("a problem acured during praktikum2 \n" + ex.getMessage());
        }
    }
    public List<Praktikum2> draktikum2(String fileName) throws ClassNotFoundException{
        List<Praktikum2> pList=null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))){
            pList = (List<Praktikum2>) in.readObject();
        } catch (IOException | ClassCastException ex) {
            System.out.printf("a problem accured during praktikum2 %s%n", fileName);
            System.out.println(ex.getMessage());
        }
        return pList;
    }
}
