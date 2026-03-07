//Create a custom exception using throw and throws keywords.
package assignment2.exceptionHandlingMultiThread;
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class Problem3 {
    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            // throw keyword
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("You are eligible.");
        }
    }

    public static void main(String[] args) {

        try {
            checkAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
