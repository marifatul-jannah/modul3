/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

import java.io.Serializable;

/**
 *
 * @author Thole
 */
public class Praktikum2 implements Serializable{
    private String firstName;
    private String lastName;
    private int age;
    
    public Praktikum2(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }    
    
    public void getAge(int age){
        this.age = age;
    }
    @Override
    public String toString(){
        return firstName +" "+ lastName +" (" + age +") ";
    }
}
