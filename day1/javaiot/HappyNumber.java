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
public class HappyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int  temp=n;
        while(temp!=1 && temp!=4){
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                sum+=digit*digit;
                temp/=10;
            }
            temp=sum;
        }
        if(temp==1)
            System.out.println(n+"is a Happy number");
        else
            System.out.println(n + " not a happy number");
        
    }
    
}
