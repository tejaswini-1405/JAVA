package DSA.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(22);
        list.add(32);
        list.add(47);
        list.add(18);
        list.add(9);
        list.add(1);
        System.out.println("list contains: " + list);
        Iterator<Integer> it= list.iterator();
        //remove the elements which are greater than 10
        while(it.hasNext()){
            Integer i=it.next();
            if(i>10){
                it.remove();
            }

        }
        System.out.println("elements which is less than 10: " + list);

    }
}
