/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaiot;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.=");
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        while(n!=0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        
    } 
        if(rev == original){
           System.out.println("palindrome");
        }else{
           System.out.println("not palindrome");
                    }
        }
    
}
