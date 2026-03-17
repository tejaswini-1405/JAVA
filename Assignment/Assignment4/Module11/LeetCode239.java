//Sliding Window Maximum
package Assignment4.Module11;
import java.util.*;
public class LeetCode239 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter window size k:");
        int k = sc.nextInt();

        Deque<Integer> dq = new LinkedList<>();

        System.out.println("Sliding Window Maximum:");

        for (int i = 0; i < n; i++) {

            // remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // print result when window is ready
            if (i >= k - 1) {
                System.out.print(nums[dq.peekFirst()] + " ");
            }
        }
    }
}
