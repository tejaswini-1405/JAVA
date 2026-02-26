/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalKeyword;


public final class Demo {
}
//class A extends Demo {cannot inherit final class
//
//}
class B{
    final void college(){
        System.out.println("SNPSU");
    }
}
class C extends B{
//void college(){//cannot override final method   
    //
    //}
    final int x=200;
    //x=300,not allowed,x is a constant(final)
    void show(final int x){
       // x=20;//cannot change the value ofa a final parameter
    }
}
    

