package exceptions;

public class Demo {
    public static void main(String[] args) {
        try{
            int balance=200;
            int withdraw=300;
            if(withdraw > balance){
               // throw new ArithmeticException("Insuffient funds");
                System.out.println("insufficient funds");
            }else{
                System.out.println("withdrawal succesful");
            }
            System.out.println("withdrawal successful");
        }catch (ArithmeticException e){
            System.out.println("Caught exception" + e.getMessage());
        }
    }
}
