//Write a program that throws an exception if age is less than 18.
package assignment2.exceptionHandlingMultiThread;

public class Problem4 {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(10);
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

