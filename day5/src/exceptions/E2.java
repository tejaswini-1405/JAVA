package exceptions;

public class E2 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=10;
        try {
            k = i / j;
            int[] arr={1,2,3,4,5};
            System.out.println(arr[9]);
        }//catch(ArithmeticException e){
            //System.out.println(e);
           // System.out.println("cannot divide by zero");
            //e.printStackTrace();//details
        //}//catch(ArrayIndexOutOfBoundsException e){
           // System.out.println("invalid array index")}
        catch(Exception e){
            System.out.println("something unexcepted happen");
        }finally{
            System.out.println("end  excecution");
            System.out.println("turn off DB");
            System.out.println("turn off internet");
            System.out.println("turn off files");
            System.out.println("turn off docker kubernetes");
        }
        System.out.println("The value of k is"+k);
    }
    static{
        System.out.println("start excecution");
        System.out.println("load DB");
        System.out.println("load internet");
        System.out.println("load files");
        System.out.println("load docker kubernetes");
    }
}//checked exception
