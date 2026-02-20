/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accesmodifier;

/**
 *
 * @author ADMIN
 */
public class ex1 {

   int a;//static fornt
   int b;//static
   void display(){//static
      System.out.println(a);
      System.out.println(b);
   }
    public static void main(String[] args) {//remove this
        ex1 ob=new ex1();
        ob.a=10;
        ob.b=20;
        ob.display();
    }
    
}
