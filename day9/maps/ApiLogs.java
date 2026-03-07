package DSA.collection.maps;

import java.util.LinkedHashMap;
import java.util.Map;
//maintain the insertion order
public class ApiLogs {
    public static void main(String[] args) {
        Map<String,String> logs=new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","login");
        logs.put("4","Browse videos");
        logs.put("3","Scroll up or scroll down");
        logs.put("5","logout");
        System.out.println("API logs: "+ logs);
    }
}
