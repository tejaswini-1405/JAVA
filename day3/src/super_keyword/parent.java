/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package super_keyword;


public class parent {

    int x=10;
    void print(){
        System.out.println("parent");
    }
}
class child extends parent{
    int x=20;
    void show(){
        super.print();
        System.out.println(x);
        System.out.println(super.x);
    }
    public static void main(String[] args) {
        child ob=new child();
        ob.show();
    }
    
}
