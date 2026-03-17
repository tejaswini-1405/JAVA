// Min Stack
package Assignment4.Module11;
import java.util.*;

class MinStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int val) {
        stack.push(val);

        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }

    void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }

        int removed = stack.pop();

        if (!minStack.isEmpty() && removed == minStack.peek()) {
            minStack.pop();
        }
    }

    int top() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stack.peek();
    }

    int getMin() {
        if (minStack.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return minStack.peek();
    }
}

public class LeetCode155 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MinStack ms = new MinStack();

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        System.out.println("Enter operations:");

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            switch (op) {
                case "push":
                    int x = sc.nextInt();
                    ms.push(x);
                    break;

                case "pop":
                    ms.pop();
                    break;

                case "top":
                    int top = ms.top();
                    if (top != -1)
                        System.out.println("Top: " + top);
                    break;

                case "min":
                    int min = ms.getMin();
                    if (min != -1)
                        System.out.println("Min: " + min);
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
