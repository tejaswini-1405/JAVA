// Evaluate Reverse Polish Notation
package Assignment4.Module11;
import java.util.*;
public class LeetCode150 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.println("Enter number of tokens:");
        int n = sc.nextInt();

        String[] tokens = new String[n];

        System.out.println("Enter tokens (space separated):");
        for (int i = 0; i < n; i++) {
            tokens[i] = sc.next();
        }

        // Stack for evaluation
        Stack<Integer> st = new Stack<>();

        for (String t : tokens) {
            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {

                int b = st.pop();  // second operand
                int a = st.pop();  // first operand

                int result = 0;

                switch (t) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = a / b; break;
                }

                st.push(result);
            } else {
                st.push(Integer.parseInt(t));
            }
        }

        // Output
        System.out.println("Final Result: " + st.pop());
    }
}
