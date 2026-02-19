/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaiot;

/**
 *
 * @author ADMIN
 */
public class pattern3 {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1|| i==5 || j==1 || j==5 ){
            System.out.print("*");
        }
                else{
        System.out.print(" ");
    }
    
}
            System.out.println();
        }
    }
}
