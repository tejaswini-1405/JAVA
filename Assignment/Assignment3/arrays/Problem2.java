//Construct a Prefix Sum array and answer multiple range sum queries.
package Assignment3.arrays;

public class Problem2 {
    static int[] buildPrefix(int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        return prefix;
    }

    static int rangeSum(int[] prefix, int L, int R) {
        if (L == 0)
            return prefix[R];
        return prefix[R] - prefix[L - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int[] prefix = buildPrefix(arr);

        System.out.println(rangeSum(prefix, 1, 3));
        System.out.println(rangeSum(prefix, 2, 4));
    }
}
