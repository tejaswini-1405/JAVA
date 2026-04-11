package DSA.algorithms.dynamicProgramming.oneD;
import java.util.*;
public class FibonacciMemoisation {
    public static int fib(int n, int[] dp) {
        //base caase
        if (n <= 1) return n;
        //Step 2:If you have the value don't calculate,just return 1
        if (dp[n] != -1) {
            return dp[n];
        }
        //step 3:if you don't know write down the answer
        return dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
    }


    public static void main(String[] args) {
        int n = 6;
        //step 1: Create a 1D dp table of size n+1 (0-based)
        int[] dp = new int[n + 1];//0-based indexing
        //sub step of 1:fill the array with default values -1
        Arrays.fill(dp, -1);
        System.out.println("Fibonacci at idex 6 is: " + fib(n,dp));
    }
}