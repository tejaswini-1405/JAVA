/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;

/**
 *
 * @author ADMIN
 */
public class BuilderExample {

    public void stringInsert(){
        StringBuilder builder=new StringBuilder("JA");
        System.out.println("old string:" + builder);
        builder.insert(1, "AV");//AV //(offset,string)
        System.out.println("New String" + builder);
        
    }
     public void stringAppend(){
          StringBuilder builder=new StringBuilder("tej");
        System.out.println("old string:" + builder);
        builder.append(" ISE ");
        System.out.println("New String" + builder);
         
     }
     public void stringReverse(){
          StringBuilder builder=new StringBuilder("tejaswini");
        System.out.println("old string:" + builder);
        builder.reverse();
        System.out.println("New String" + builder);
     }

    
    public static void main(String[] args) {
        new BuilderExample().stringInsert();
        new BuilderExample().stringAppend();
        new BuilderExample().stringReverse();
        
    }
    
}
