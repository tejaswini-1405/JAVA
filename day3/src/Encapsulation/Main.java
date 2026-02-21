/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author ADMIN
 */
public class Main {

    
    public static void main(String[] args) {
        Student ob=new Student("Teju",115);
        System.out.println(ob.getname());
        
        ob.setname("Anup");
        System.out.println(ob.getname());
        
        System.out.println(ob.getage());
        
        ob.setage(118);
        System.out.println(ob.getage());
        
    }
    
}
