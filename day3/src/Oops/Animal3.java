/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Oops;

/**
 *
 * @author ADMIN
 */
public class Animal3 {
    void print(){
        System.out.println("sound");
    }

    
}

class dog extends Animal3{
    void sound(){
        System.out.println("bowww");
    }
}
class cat extends Animal3{
    void display(){
       System.out.println("meoww");
    }
     public static void main(String[] args) {
        cat ob=new cat();
        dog d=new dog();
        ob.display();
        d.sound();
        ob.print();
    }
    
    
}
