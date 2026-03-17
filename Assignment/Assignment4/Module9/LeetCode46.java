package Assignment4.Module9;

import java.util.*;

public class LeetCode46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<List<Integer>> result = new ArrayList<>();
        permute(nums, new boolean[n], new ArrayList<>(), result);

        System.out.println("Permutations are:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }

    static void permute(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> result) {
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;

            used[i] = true;
            temp.add(nums[i]);

            permute(nums, used, temp, result);

            temp.remove(temp.size() - 1); // backtrack
            used[i] = false;
        }
    }
}