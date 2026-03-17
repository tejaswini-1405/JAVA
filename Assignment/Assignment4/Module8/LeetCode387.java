//First unique character in a string
package Assignment4.Module8;
import java.util.*;
public class LeetCode387{
        public static void main(String[] args) {
            System.out.println("Enter a string : ");
            Scanner sc = new Scanner(System.in);

            String s = sc.nextLine(); // ✅ reads full line

            int[] freq = new int[26];

            for (char c : s.toCharArray()) {
                if (c != ' ') { // optional: ignore spaces
                    freq[c - 'a']++;
                }
            }

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != ' ' && freq[s.charAt(i) - 'a'] == 1) {
                    System.out.println(i);
                    return;
                }
            }

            System.out.println(-1);
        }
    }
