/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package InterfaceConcepts;


public interface InterfaceEx {
    void display();
    
    
}
class A{
    
}
class B{
    public static void main(String[] args){
        A a=new A();
        B b=new B();
        //old java code - boring code :boilerplate code in VS code
        InterfaceEx obj=new InterfaceEx(){
            public void display(){
                System.out.println("hello");
            }
        };
        //java 8 or 1.8 :Lambda expressions (Scala)
        InterfaceEx obj1= () -> System.out.println("Hello");
        obj.display();
        obj1.display();
    }
}
