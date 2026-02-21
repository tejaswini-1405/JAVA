/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package super_keyword;

class Parent{
    Parent(){
        System.out.println("parent");
    }
}
public class childcons extends Parent {
    childcons(){
        super();
        System.out.println("child");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        childcons c=new childcons();
     
    }
    
}
