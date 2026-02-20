
package problems;
import java.util.*;

public class fibonacci {

        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.=");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fibonacci series");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int next=a+b;
            a=b;
            b=next;
        }
    }
    
}
