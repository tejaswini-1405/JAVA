//Solve the Two Sum problem using optimized approach.
package Assignment3.arrays;
import java.util.*;
public class Problem5 {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int need = target - arr[i];

            if (map.containsKey(need)) {
                System.out.println("Pair: " + need + " , " + arr[i]);
                break;
            }

            map.put(arr[i], i);
        }
    }
}
