package exceptions;

public class E4 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("eligible- access denied");
        }else{
            throw new RuntimeException("not eligible- access denied");
        }
        }

    public static void main(String[] args) {
        checkAge(20);
    }
    }
