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
public class armstrong {
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int temp=n, Sum=0;
        int count=0;
        while(temp!=0){
            count++;
            temp=temp/10;
        }
        temp=n;
        while(temp!=0){
            int d=temp%10;
            Sum+=Math.pow(d,count);
            temp=temp/10;
        }
        if(n==Sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not");
        }
    }
}