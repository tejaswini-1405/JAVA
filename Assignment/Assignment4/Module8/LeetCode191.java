//Number of 1 Bits
package Assignment4.Module8;
import java.util.*;
public class LeetCode191 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        // Display binary representation
        String binary = Integer.toBinaryString(n);
        System.out.println("Binary representation: " + binary);

        int count = 0;

        while (n != 0) {
            count += (n & 1); // check last bit
            n = n >>> 1;      // unsigned right shift
        }

        System.out.println("Number of 1 bits: " + count);
    }
}
