package DSA.nonLinear.heaps;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class KthSmallestElement {
    static void findKthSmallestElement(int[] arr,int k){
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            maxHeap.add(num);
            if(maxHeap.size()>k){
                maxHeap.poll();//Remove smallest if size > k
            }
        }
        //print the kth largest
        System.out.println("The kth largest is: " + Arrays.toString(arr) + " is " +maxHeap.peek());
        }

public static void main(String[] args) {
    int[] arr = {4,9,2,1,3,0};
    int k = 3;
    findKthSmallestElement(arr, k);
}
}

