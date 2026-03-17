// Implement Queue using Stacks
package Assignment4.Module11;
import java.util.*;
class MyQueue {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // enqueue
    void push(int x) {
        s1.push(x);
    }

    // dequeue
    int pop() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // front element
    int peek() {
        if (empty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
public class LeetCode232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyQueue q = new MyQueue();

        System.out.println("Enter number of operations:");
        int n = sc.nextInt();

        System.out.println("Enter operations (push x / pop / peek / empty):");

        for (int i = 0; i < n; i++) {
            String op = sc.next();

            switch (op) {
                case "push":
                    int x = sc.nextInt();
                    q.push(x);
                    break;

                case "pop":
                    int removed = q.pop();
                    if (removed != -1)
                        System.out.println("Removed: " + removed);
                    break;

                case "peek":
                    int front = q.peek();
                    if (front != -1)
                        System.out.println("Front: " + front);
                    break;

                case "empty":
                    System.out.println("Is Empty: " + q.empty());
                    break;

                default:
                    System.out.println("Invalid operation");
            }
        }
    }
}
