//Write a program to find the sum of all even numbers between 1 and 100 using a while
//loop.
package java_basics;

public class problem5 {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            if (n % 2 == 0) {
                sum += n;
            }
            n++;
        }
        System.out.println("Sum :"+sum);
    }

}
