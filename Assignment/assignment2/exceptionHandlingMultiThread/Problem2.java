//Write a program using try-catch-finally to handle division by zero.
package assignment2.exceptionHandlingMultiThread;

public class Problem2 {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        finally {
            System.out.println("Finally block executed.");
        }
    }
}
