//subsets
package Assignment4.Module9;
import java.util.*;
public class LeetCode78 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size:");
            int n = sc.nextInt();

            int[] nums = new int[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            List<List<Integer>> result = new ArrayList<>();
            backtrack(0, nums, new ArrayList<>(), result);

            System.out.println(result);
        }

        static void backtrack(int start, int[] nums, List<Integer> temp, List<List<Integer>> result) {
            result.add(new ArrayList<>(temp));

            for (int i = start; i < nums.length; i++) {
                temp.add(nums[i]);
                backtrack(i + 1, nums, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

