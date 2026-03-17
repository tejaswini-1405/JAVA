//Valid Anagram
package Assignment4.Module8;
import java.util.*;
public class LeetCode242 { public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take string input
        System.out.println("Enter the string s: ");
        String s = sc.next();
        System.out.println("Enter the string t: ");
        String t = sc.next();
        // Convert to char array
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        // Sort arrays
        Arrays.sort(a);
        Arrays.sort(b);
        // Check and print result
        if (Arrays.equals(a, b)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}