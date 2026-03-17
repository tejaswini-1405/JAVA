//Single  Number using XOR
package Assignment4.Module8;
import java.util.*;
public class LeetCode136 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = 0;

        for (int num : nums) {
            result ^= num;
        }

        System.out.println("Single number is: " + result);
    }
}