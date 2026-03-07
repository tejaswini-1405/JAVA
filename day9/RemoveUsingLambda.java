package DSA.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(32);
        list.add(47);
        list.add(18);
        list.add(9);
        list.add(1);
        System.out.println("Before " + list);
       list.removeIf(n->n%2==0);
        System.out.println("After " + list);

    }
}
