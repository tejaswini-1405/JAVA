//Implement Binary Search iteratively
package Assignment3.searchingSorting;

public class Problem1Iterative {
    static int binarySearch(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] < key)
                start = mid + 1;

            else
                end = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};
        int key = 8;

        System.out.println(binarySearch(arr, key));
    }
}
