//Find first and last occurrence of an element using Binary Search.
package Assignment3.searchingSorting;

public class problem2 {

    static int firstOcc(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            }
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return ans;
    }

    static int lastOcc(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {

            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            }
            else if (arr[mid] < key)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,2,2,3,4,5};
        int key = 2;

        System.out.println("First Occurrence: " + firstOcc(arr,key));
        System.out.println("Last Occurrence: " + lastOcc(arr,key));
    }
}
