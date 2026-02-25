//Write a program with a method that calculates the factorial of a number using
//recursion.
package java_basics;

import java.util.*;


public class problem1 {
        public void check(int n) {
        if (n == 0) {
            System.out.println("The number is " + n);
        } else if (n > 0) {
            System.out.println("The number " + n + " is Positive");
        } else {
            System.out.println("The number " + n + " is negative");

        }
    }

    public static void main(String[] args) {
        System.out.print("Enter Your Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        problem1 obj = new problem1();
        obj.check(n);
        sc.close();
    }
}

