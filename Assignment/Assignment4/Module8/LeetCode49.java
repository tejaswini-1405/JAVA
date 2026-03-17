//Group Anagrams
package Assignment4.Module8;
import java.util.*;
public class LeetCode49 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // prompt for number of strings
            System.out.println("Enter number of strings:");
            int n = sc.nextInt();
            sc.nextLine(); // consume newline

            String[] strs = new String[n];

            // prompt for strings
            System.out.println("Enter the strings:");
            for (int i = 0; i < n; i++) {
                strs[i] = sc.nextLine();
            }

            // HashMap to group anagrams
            Map<String, List<String>> map = new HashMap<>();

            for (String str : strs) {
                char[] arr = str.toCharArray();
                Arrays.sort(arr);

                String key = new String(arr);

                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(str);
            }

            // print result
            System.out.println("Grouped Anagrams:");
            for (List<String> group : map.values()) {
                System.out.println(group);
            }
        }
    }