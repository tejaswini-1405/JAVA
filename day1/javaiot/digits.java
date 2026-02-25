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
public class digits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int count=0;
        if(n==0){
            System.out.println("no. of digits ="+ 1);
        }
        else{
            while(n!=0){
                count++;
                n=n/10;
            }
            System.out.println("the no. of digits=" + count);
        }
    }
    
}
