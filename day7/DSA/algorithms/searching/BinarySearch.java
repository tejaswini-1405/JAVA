package DSA.algorithms.searching;
import java.util.*;

public class BinarySearch {
    static int binarySearch(int[] arr,int key){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                s=mid+1;//go to the right side to find the key
            }else{
                e=mid-1;//go to the left side to find the key
            }
        }
        return -1;//key is not found, return as invalid
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,9,12};
        System.out.println(binarySearch(arr,9));//return the index of 9 which is 4
        System.out.println(binarySearch(arr,900));//not found
        //if we want to return the key also
        int key=8;
        int index=binarySearch(arr,key);
        if(index!=-1){
            System.out.println(key+" is present at index " + index);
            System.out.println(key+" is present at index " + index + " in the array; " + Arrays.toString(arr));
        }else{
            System.out.println(key + " is not present");
            System.out.println(key+" is  not present in the array; " + Arrays.toString(arr));
        }
    }
}
