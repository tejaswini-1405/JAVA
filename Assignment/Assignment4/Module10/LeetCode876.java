//Middle of the Linked List
package Assignment4.Module10;
import java.util.*;
public class LeetCode876 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();

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

        ListNode mid = middleNode(head);

        System.out.println("Middle node and remaining list:");
        while (mid != null) {
            System.out.print(mid.val + " ");
            mid = mid.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
