/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstraction;

/**
 *
 * @author ADMIN
 */
public interface Animal_interface {
    /*
    Interface methods are completely abstract & cannot have body.
    they are implemented in the respective child classes
    therefore, interfaces exhibit 100% abstraction
    */
   void sound();
   void run();
}
class Cat implements Animal_interface{
    @Override
    public void sound(){
        System.out.println("cats meow");
    }
    @Override
    public void run(){
        System.out.println("cats runs fast");
    }
}
class Dog implements Animal_interface{
    @Override
    public void sound(){
        System.out.println("dog barks");
    }
    @Override
    public void run(){
        System.out.println("dogs runs fast");
    }
}
class Demo{
    public static void main(String[] args){
        Cat c=new Cat();
        Dog d=new Dog();
        c.run();
        c.sound();
        d.run();
        d.sound();
    }
}


