/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;

class Animal{
    void sound(){
        System.out.println("Animal makes qa sound");
    }
}
public class Dog extends Animal {
    @Override
    void sound(){
        System.out.println("dog barks");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal obj=new Dog();
        obj.sound();
    }
    
}
