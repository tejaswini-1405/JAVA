package DSA.algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {//void not int bcz we are not return anything we just update
        int n = arr.length;
        for (int i = 1; i < n; i++) { //1 to n-1 => < n[Iterations]
            for (int j = 0; j < n - 1; j++) {//go till the 2nd last
                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    public static void main(String[] args) {
        int[] arr={2,5,7,8,1,3,9,4};
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}