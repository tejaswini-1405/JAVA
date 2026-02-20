/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor;

/**
 *
 * @author ADMIN
 */
public class student1 {
    int id;
    String name;
    double salary;
    student1(int id,String name,double salary){
       this.name=name;
        this.id=id;
        this.salary=salary;
    }
    void details(){
        System.out.println("Name="+name);
        System.out.println("id="+id);
        System.out.println("salary="+salary);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        student1 s1=new student1(1,"tej",100000);
         student1 s2=new student1(2,"Bindu",1000);
         s1.details();
         s2.details();
    }
    
}
