/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problems;
import java.util.*;
/**
 *
 * @author ADMIN
 */
public class Neon {
    public static boolean check(int n){
        int sq=n*n;
        int sum=0;
        int temp=sq;
        while(temp!=0){
            int d=temp%10;
            sum=sum+d;
            temp=temp/10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }

  
    public static void main(String[] args) {
       
        Neon ob=new Neon();
        System.out.println(ob.check(9));
        
    }
    
}
