package DSA.bitManipulation;

public class CheckkthBit {
    public static void main(String[] args) {
        int n=10;
        int k=1;
        if((n&(1<<k))!=0){
            System.out.println("bit is set");
        }else{
            System.out.println("bit is not set");
        }
    }
}
