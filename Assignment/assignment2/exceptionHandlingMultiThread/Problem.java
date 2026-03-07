//Write a program to demonstrate checked and unchecked exceptions with examples.
package assignment2.exceptionHandlingMultiThread;
import java.io.*;
public class Problem {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception: " + e);
        }
        try {
            FileReader file = new FileReader("test.txt"); // FileNotFoundException
            BufferedReader br = new BufferedReader(file);
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}
