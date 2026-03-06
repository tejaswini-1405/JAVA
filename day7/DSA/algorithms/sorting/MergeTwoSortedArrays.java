package DSA.algorithms.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {//sandbox
        int[] arr1={1,3,5,7,9};
        int[] arr2={2,4,6};
        int[] merged=mergeTwoSortedArray(arr1,arr2);
        System.out.println("merged Array: " + Arrays.toString(merged));
    }
    public static int[] mergeTwoSortedArray(int[] arr1,int[] arr2){
        //write your code here
        int n1= arr1.length;
        int n2=arr2.length;
        int[] merged=new int[n1+n2];
        int i=0,j=0,k=0;
        //edge case
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                merged[k++]=arr1[i++];
            }else{
                merged[k++]=arr2[j++];

            }
        }
        //check if there are any remaining elements in the two arrays
        while(i<n1){
            merged[k++]=arr1[i++];
        }
        while(j<n2){
            merged[k++]=arr2[j++];
        }
        return merged;
    }
}
