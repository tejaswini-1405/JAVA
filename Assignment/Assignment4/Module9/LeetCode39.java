//Combination sum
package Assignment4.Module9;
import java.util.*;
public class LeetCode39 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter number of elements:");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter target value:");
            int target = sc.nextInt();

            List<List<Integer>> result = new ArrayList<>();
            backtrack(arr, target, 0, new ArrayList<>(), result);

            System.out.println("Combinations are:");
            for (List<Integer> list : result) {
                System.out.println(list);
            }
        }

        static void backtrack(int[] arr, int target, int start, List<Integer> temp, List<List<Integer>> result) {
            if (target == 0) {
                result.add(new ArrayList<>(temp));
                return;
            }

            if (target < 0) return;

            for (int i = start; i < arr.length; i++) {
                temp.add(arr[i]);
                backtrack(arr, target - arr[i], i, temp, result);
                temp.remove(temp.size() - 1);
            }
        }
    }

