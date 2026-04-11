package DSA.algorithms.dynamicProgramming.oneD;

public class FibonacciRecursion {
    public static int fibnoacci(int n){
        //edge case,corner case,ground case
        if(n<=1){
            return n;//n=0,return 0,n=1,return 1

        }
        return fibnoacci(n-1) + fibnoacci(n-2);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println("Fibonacci at inddex 5 is: " + fibnoacci(n));
    }

}
