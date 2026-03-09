//Implement Binary Search  recursively.
package Assignment3.searchingSorting;

public class Problem1Recursive {
    static int binarySearch(int[] arr, int start, int end, int key) {

        if (start > end)
            return -1;

        int mid = (start + end) / 2;

        if (arr[mid] == key)
            return mid;

        else if (arr[mid] < key)
            return binarySearch(arr, mid + 1, end, key);

        else
            return binarySearch(arr, start, mid - 1, key);
    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12};
        int key = 8;

        System.out.println(binarySearch(arr,0,arr.length-1,key));
    }
}
