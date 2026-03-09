package Assignment3.arrays;

public class Problem3 {
    static void rangeUpdate(int[] diff, int L, int R, int val) {
        diff[L] += val;

        if (R + 1 < diff.length) {
            diff[R + 1] -= val;
        }
    }

    static void buildFinalArray(int[] diff) {
        for (int i = 1; i < diff.length; i++) {
            diff[i] += diff[i - 1];
        }
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int[] diff = new int[arr.length];
        diff[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            diff[i] = arr[i] - arr[i - 1];
        }

        rangeUpdate(diff, 1, 3, 5);

        buildFinalArray(diff);

        for (int num : diff) {
            System.out.print(num + " ");
        }
    }
}
