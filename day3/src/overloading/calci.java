/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

/**
 *
 * @author ADMIN
 */
public class calci {
    static void calculator(int a,int b){
        System.out.println(a+b);
    }
    static void calculator(double a,double b){
        System.out.println(a*b);
    }
    static int calculator(int a,int b,int c){
        return (a+b)/c;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       calculator(5,8);
       calculator(10.9,7.9);
       System.out.println(calculator(7,9,13));
    }
    
}
