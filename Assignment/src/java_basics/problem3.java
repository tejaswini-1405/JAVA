/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package java_basics;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class problem3 {

   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0 - 100): ");
        int marks = sc.nextInt();

        switch (marks / 10) {
            case 10:   
            case 9:
                System.out.println("Grade: A");
                break;

            case 8:
                System.out.println("Grade: B");
                break;

            case 7:
                System.out.println("Grade: C");
                break;

            case 6:
                System.out.println("Grade: D");
                break;

            default:
                System.out.println("Grade: F");
        }

        sc.close();
        
    }
    
}

