//Write a program to demonstrate the difference between String, StringBuilder, and
//StringBuffer.
package assignment2.advanceJava;

public class Problem3 {
        public static void main(String[] args) {
            String s = "Hello";
            s.concat(" World");   // does not change the original string
            System.out.println("String value: " + s);

            // StringBuilder (Mutable, not thread-safe)
            StringBuilder sb = new StringBuilder("Hello");
            sb.append(" World");   // modifies the original object
            System.out.println("StringBuilder value: " + sb);

            // StringBuffer (Mutable, thread-safe)
            StringBuffer sbf = new StringBuffer("Hello");
            sbf.append(" World");  // modifies the original object
            System.out.println("StringBuffer value: " + sbf);
        }
    }

