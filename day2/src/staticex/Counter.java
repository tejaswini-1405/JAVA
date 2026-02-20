/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package staticex;


public class Counter {

    static int count=0;
    int id;
    Counter(){
        count++;
        id=count;
        System.out.println("Object ID:"+id);
    }
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        System.out.println("total objects created:" + count);
    }
    
}
