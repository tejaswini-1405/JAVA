
package String;


public class MutableStrings {

    
    public static void main(String[] args) {
        String s="SNPSU";
        s += " ISE ";
        System.out.println("String:" + s);
        //Mutable-thread safe
        StringBuffer buffer=new StringBuffer("SNPSU");
        buffer.append(" ISE ");
        System.out.println(buffer);
        //Mutable - not thread safe
        StringBuilder builder=new StringBuilder("SNPSU");
        builder.append(" ISE ");
        System.out.println(builder);
    }
    
}
