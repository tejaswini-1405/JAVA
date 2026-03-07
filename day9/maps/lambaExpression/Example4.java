package DSA.collection.maps.lambaExpression;

import java.util.ArrayList;
//java stream API- Java 8 (::) -> Stream (::) lambda(->)
public class Example4 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(3);
        list.add(1);
        list.forEach(System.out::println);//STREAM API Java 8
        list.forEach(n->System.out.println(n));//Lambda

    }
}
