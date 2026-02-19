/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaiot;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class StrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }
        if(sum==original)
            System.out.println("strong number");
        else
            System.out.println("not a strong number");
    }
    
}
