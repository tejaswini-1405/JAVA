package arrays;
//Varargs-> ...{It internally uses arrays}
public class E6 {
    public static void display(int... arr) {//instead of int[] we use int...
        for(int num : arr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        display(arr);
    }
}
