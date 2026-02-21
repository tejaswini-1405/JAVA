/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overriding;
class Parent{
    void show(){
        System.out.println("parent static method");
    }
}
/**
 *
 * @author ADMIN
 */
public class child extends Parent {
    void show(){
        System.out.println("child static method");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parent obj=new child();
        obj.show();
    }
    
}
