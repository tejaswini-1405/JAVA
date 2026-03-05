package DSA.algorithms.sorting;
import java.io.*;
import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {//{n-1} iteration
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }

            }
            if(minIndex !=i){//what we took as min index is wrong,so swap
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={8,6,3,5,4,9,1};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}