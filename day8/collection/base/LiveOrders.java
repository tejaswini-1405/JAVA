package DSA.collection.base;
import java.util.*;


public class LiveOrders {
    public static void main(String[] args) {
        Collection<String> liveOrders =new ArrayList<>();
        //new orders are added
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        //check order
        System.out.println("ORD103 exists?"+liveOrders.contains("ORD104"));
        //check the live orders
        System.out.println("live orders: " + liveOrders);
        liveOrders.clear();
        System.out.println("orders after closing" + liveOrders);
        liveOrders.remove("ORD103");
        System.out.println("after remove"+liveOrders);
    }
}
