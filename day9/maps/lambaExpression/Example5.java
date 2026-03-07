package DSA.collection.maps.lambaExpression;

import java.util.ArrayList;
import java.util.Collections;

public class Example5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println("Initial list: " + list);
        Collections.sort(list,(a,b)->b-a);//descending b-a
        System.out.println("sorted list descending:" + list);
        Collections.sort(list,(a,b)->a-b);//ascending a-b
        System.out.println("sorted list ascending:" + list);
    }
}
