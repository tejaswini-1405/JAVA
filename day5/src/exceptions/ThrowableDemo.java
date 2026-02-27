package exceptions;

public class ThrowableDemo {
    static void test() throws Throwable{
        throw new Throwable("something went wrong!");

    }

    public static void main(String[] args) {
        try{
            test();

        }catch(Throwable t){
            //fully qualified name
            System.out.println("handled:" + t);
            //Message
            System.out.println("Handled:" + t.getMessage());
        }
    }
}
/*
throw new String("Error"); not possible❌
throw new Integer("error); not possible❌
throw new Exception("error"); possible✅
throw new Throwable("error");possible✅
throw new IOException("error"); possible✅ℹ️
 */