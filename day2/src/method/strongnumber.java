
package method;
import java.util.*;

public class strongnumber {
    int factorial(int d){
        int fact=1;
        for(int i=1;i<=d;i++){
            fact=fact*i;
        }
        return fact;
    }
    boolean isStrongnumber(int n){//n=145
        int temp=n;
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum=sum+factorial(d);
            n=n/10;
        }
        if(sum==temp){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        strongnumber obj=new strongnumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.");
        int n= sc.nextInt();
        
        System.out.println(obj.isStrongnumber(n));
    }
    
}
