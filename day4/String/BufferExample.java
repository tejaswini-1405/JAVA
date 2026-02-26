/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package String;


public class BufferExample {
    public void stringInsert(){
        StringBuffer buffer=new StringBuffer("JA");
        System.out.println("old string:" + buffer);
        buffer.insert(1, "AV");//AV //(offset,string)
        System.out.println("New String" + buffer);
        
    }
     public void stringAppend(){
          StringBuffer buffer=new StringBuffer("tej");
        System.out.println("old string:" + buffer);
        buffer.append(" ISE ");
        System.out.println("New String" + buffer);
         
     }
     public void stringReverse(){
          StringBuffer buffer=new StringBuffer("tejaswini");
        System.out.println("old string:" + buffer);
        buffer.reverse();
        System.out.println("New String" + buffer);
     }

    
    public static void main(String[] args) {
        new BufferExample().stringInsert();
        new BufferExample().stringAppend();
        new BufferExample().stringReverse();
        
    }
    
}
