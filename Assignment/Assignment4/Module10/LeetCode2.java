//Add Two Numbers
package Assignment4.Module10;
import java.util.*;
public class LeetCode2 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of list1:");
        int n1 = sc.nextInt();

        ListNode l1 = createList(sc, n1);

        System.out.println("Enter size of list2:");
        int n2 = sc.nextInt();

        ListNode l2 = createList(sc, n2);

        ListNode result = addTwoNumbers(l1, l2);

        System.out.println("Result:");
        print(result);
    }

    static ListNode createList(Scanner sc, int n) {
        ListNode head = null, tail = null;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            ListNode node = new ListNode(sc.nextInt());

            if (head == null) head = tail = node;
            else {
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }

        return dummy.next;
    }

    static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
