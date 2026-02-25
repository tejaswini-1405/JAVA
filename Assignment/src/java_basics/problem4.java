//Write a program to print the multiplication table of a given number using a for loop
package java_basics;
import java.util.*;

public class problem4 {
    public static void main(String[] args) {
        System.out.print("Enter Your Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(n+" * "+i+" = "+n*i);
        }
        sc.close();
    }

}
