//Implement Insertion Sort and explain its advantage for nearly sorted arrays
package Assignment3.searchingSorting;

public class Problem6 {
    public static void main(String[] args) {

        int[] arr = {5, 3, 8, 4, 2};

        for (int i = 1; i < arr.length; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
