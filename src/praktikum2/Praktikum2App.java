/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thole
 */
public class Praktikum2App {
    public static void main(String[] args) throws ClassNotFoundException {
        List<Praktikum2> praktikum2 = new ArrayList<Praktikum2>();
        praktikum2.add(new Praktikum2("ade","aja",22));
        praktikum2.add(new Praktikum2("ami","fahmi",21));
        praktikum2.add(new Praktikum2("haya","hayati",20));
        praktikum2.add(new Praktikum2("aya","hayati",19));
        System.out.println("Praktikum 2 : " + praktikum2);
        
        Praktikum2Demo demo = new Praktikum2Demo();
        demo.praktikum(praktikum2, "praktikum2Data.ser");
        System.out.println("praktikum2 is done");
                
        System.out.println("praktikum2 object");
        List<Praktikum2> newList = demo.draktikum2("praktikum2Data.ser");
        System.out.println("new List : " + newList);
        
    }
}
