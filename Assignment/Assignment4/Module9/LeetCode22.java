//Generate Parentheses
package Assignment4.Module9;
import java.util.*;
public class LeetCode22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of pairs:");
        int n = sc.nextInt();

        List<String> result = new ArrayList<>();
        generate("", 0, 0, n, result);

        System.out.println("Valid Parentheses combinations are:");
        for (String str : result) {
            System.out.println(str);
        }
    }

    static void generate(String s, int open, int close, int n, List<String> result) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        if (open < n)
            generate(s + "(", open + 1, close, n, result);

        if (close < open)
            generate(s + ")", open, close + 1, n, result);
    }
}
