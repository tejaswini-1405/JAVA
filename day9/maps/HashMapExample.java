package DSA.collection.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        //the values can be duplicate, but the keys have to be unique
        Map<String ,String> hashmap=new HashMap<>();
        hashmap.put("01","aaaa");
        hashmap.put("03","bbbb");
        hashmap.put("04","cccc");
        hashmap.put("02","dddd");
        for(Map.Entry<String,String> entry:hashmap.entrySet()){
            System.out.println(entry.getKey()+" ," + entry.getValue());
        }
        Map<String ,String> hashmap1=new LinkedHashMap<>();
        hashmap1.put("01","aaaa");
        hashmap1.put("03","bbbb");
        hashmap1.put("04","cccc");
        hashmap1.put("02","dddd");
        for(Map.Entry<String,String> entry:hashmap1.entrySet()){
            System.out.println(entry.getKey()+" ," + entry.getValue());
        }
    }
}
