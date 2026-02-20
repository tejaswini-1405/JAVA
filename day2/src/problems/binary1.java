/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problems;
import java.util.*;

public class binary1 {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no=");
        int n=sc.nextInt();
        int count=0;
        int temp=n;
        while(temp>0){
            if(temp%2==1){
                count++;
            }
            temp=temp/2;
        }
        System.out.println("Binary form: " + Integer.toBinaryString(n));
        System.out.println("Number of 1 bits: " + count);
    }
    
}
