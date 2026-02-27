package exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=0;
        try {
            k = i / j;
        }catch(ArithmeticException e){
            //System.out.println(e);
            System.out.println("cannot divide by zero");
            e.printStackTrace();//details
        }
        System.out.println("The value of k is"+k);
    }
}//checked exception
