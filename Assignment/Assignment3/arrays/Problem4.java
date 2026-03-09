//Find all pairs in an array whose sum equals a target value.
package Assignment3.arrays;

public class Problem4 {
    public static void findPairs(int[] arr, int target) {

        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {

                if(arr[i] + arr[j] == target) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }

            }
        }

    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 3, 5, 7, 8};
        int target = 9;

        findPairs(arr, target);
    }
}
