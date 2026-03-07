package DSA.collection.maps;

import java.util.Hashtable;
public class HashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(106, "Sharanya ");
        ht.put(117, "Trupthi ");
        ht.put(128, "sonika ");
        ht.put(100, "siri ");
        ht.put(99, "sonu ");
        ht.put(101, "sinch ");
        ht.put(115, "Harshi ");
        System.out.println(ht.getOrDefault(101,"Not Found"));
        System.out.println(ht.getOrDefault(200,"Not Found"));
        ht.putIfAbsent(104,"varshini");//this will be added
        System.out.println("updated table:" + ht);
        ht.putIfAbsent(99,"rama");//this won't be added bcz 99 already present
        System.out.println("updated table: "+ht);
    }
}
