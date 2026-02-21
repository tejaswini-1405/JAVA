/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Encapsulation;

/**
 *
 * @author ADMIN
 */
public class Student {
    private String name;
    private int age;
    
    Student(String n,int a){
        name=n;
        age=a;
    }
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name=name;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age=age;
    }
    
}
//class Main {

    
   // public static void main(String[] args) {
    //    Student ob=new Student("Teju",115);
      //  System.out.println(ob.getname());
        
      //  ob.setname("Anup");
       // System.out.println(ob.getname());
        
  //  }
    
//}
