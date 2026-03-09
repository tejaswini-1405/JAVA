//Find the missing number from an array containing numbers from 1 to n.
package Assignment3.arrays;

public class Problem9 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 5};
        int n = 5;

        int totalSum = n * (n + 1) / 2;
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missing = totalSum - arrSum;

        System.out.println("Missing number: " + missing);
    }
}
