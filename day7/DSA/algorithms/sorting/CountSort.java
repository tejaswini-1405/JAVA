package DSA.algorithms.sorting;
import java.io.*;
import java.util.Arrays;

public class CountSort {
    public static void countSort(int[] arr) {
        //step 1:find the max
        int k = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > k) {
                k = arr[i];
            }
        }
        //step 2:create a count array[0-max]
        int[] count = new int[k + 1];
        //step 3:calculate the freq of each element in the array
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        //step 4: Calculate the cumulative frequency
        //skip index 0 and start from 1 till max(k)
        for (int i = 1; i <= k; i++) {
            //cur=cur+prev
            count[i]+=count[i-1];
        }
        //step 5 :create the output array
        int[] output = new int[arr.length];
        //step 6: start from the end of the array(L<-R)
        for(int i=arr.length-1;i>=0;i--){
            output[--count[arr[i]]]=arr[i];
        }
        //copy the output back to the input
        System.arraycopy(output,0,arr,0 , arr.length);
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,3,4,1,6,4,3};
        System.out.println(Arrays.toString(arr));
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
