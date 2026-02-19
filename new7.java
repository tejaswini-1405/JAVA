/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaiot;

/**
 *
 * @author ADMIN
 */
public class new7 {
    public static void main(String[] args) {

        int n = 6;

        for (int i = n / 2; i <= n; i += 2) {

            for (int j = 1; j < n - i; j += 2)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("*");

            System.out.println();
        }

        for (int i = n; i >= 1; i--) {

            for (int j = i; j < n; j++)
                System.out.print(" ");

            for (int j = 1; j <= (i * 2) - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
    

