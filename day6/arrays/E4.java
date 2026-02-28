package arrays;

public class E4 {
    //passing array in to method
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int[] createArray(){//return an array of integer
        return new int[]{10,20,30};//new array created & returned
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        printArray(arr);
        int[] result =createArray();
        for(int num : result){
            System.out.print(num + " ");
        }
        System.out.println();
        //Annonymous array -> we don't have a reference/object.
        //After the method call,we can never access it.
        printArray(new int[]{100,200,300});
    }
}
