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
public class binary2 {
    public static int no_bits(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
        
    }
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Binary form: " + Integer.toBinaryString(n));
        int result=no_bits(n);
        System.out.println("The number of 1's are:" + result);
    }
    
}
