package DSA.collection.maps;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht=new Hashtable<>();
        ht.put(106 ,"Sharanya ");
        ht.put( 117,"Trupthi ");
        ht.put(128 ,"sonika ");
        ht.put( 100,"siri ");
        ht.put(99 ,"sonu ");
        ht.put(101 ,"sinch ");
        ht.put(115 ,"Harshi ");
        ht.put(98,"radha");
       // ht.put(null,"some");//no null keys allowed in HashTable but we can add null values
        for(Map.Entry<Integer,String> entry:ht.entrySet()){
            System.out.println(entry.getKey() + " ," + entry.getValue());
           // String str="java";
            //System.out.println(str.hashCode());
        }
        ht.remove(98);
        System.out.println(ht);
    }
}
