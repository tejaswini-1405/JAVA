package DSA.bitManipulation;

public class FindTheValueOfRSB {
    public static void main(String[] args) {
        int n=12;//1100
                 //8421 powers of 2
        int result=n & -n;
        System.out.println("Rightmost set bit value: " + result);
        System.out.println(~5);
        System.out.println(~-5000);
    }
}
