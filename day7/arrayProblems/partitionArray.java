package arrays.arrayProblems;
import java.util.*;
public class partitionArray {
    public static void main(String[] args) {

        int[] arr = {3, 8, 5, 12, 7, 6};
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0) {
                left++;//If the left side has even no.s, move forward
            }
            while (arr[right] % 2 != 0) {
                right--;// If the right side has odd numbers,move backwards
            }
            if (left < right) {//if the numbers and sides don't match,swap
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        //System.out.println(Arrays.toString(arr));
        for(int x: arr){
            System.out.println(x + " ");
        }
    }
}
