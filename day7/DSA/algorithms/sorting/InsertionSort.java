package DSA.algorithms.sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            while (j >= 0 && arr[j] > temp) {
                //shift operations
                arr[j+1]=arr[j];
                j--;//create empty space [ ] by shifting
            }
            arr[j+1]=temp;
        }
    }
public static void main(String[] args) {
    int[] arr={8,6,3,5,4,9,1};
    System.out.println(Arrays.toString(arr));
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
}
}