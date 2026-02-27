package exceptions;

import java.io.IOException;
/*
java.io.IOException -> fully qualified ClassName
For checked exceptions we always use try-catch block
the 'throws' keyword doesn't handle the exception
It only passes on the information to the calling method
the calling method has to handle the exception using try-catch
the 'throws' keyword is written in the method signature (name)
*/
public class CheckException {
    static void readFile()throws IOException {
        throw new IOException("File not found");
    }

    public static void main(String[] args) {
        try{
            display();
        }catch (IOException e){
            System.out.println(e.getMessage());//this is for display only the message
        }

    }
    static void display()throws IOException{
        readFile();
    }
}
//java.io.IOException ->>this part in the output is the Fully qualified class name