/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

class Bank{
    void interest(){
        System.out.println("bank provides interest on deposits");
    }
    void interest(double rate){
        System.out.println("the interest of the bank is" + rate);
    }
}
public class SBI extends Bank {
    void interest(double rate,int years){
        double principal=1000;
        double totalInterest = (principal * rate * years) / 100;

        System.out.println("Total interest for " + years + " years = " + totalInterest);
        
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SBI s=new SBI();
        s.interest();
        s.interest(7.5);
        s.interest(7.5,4);
    }
    
}
