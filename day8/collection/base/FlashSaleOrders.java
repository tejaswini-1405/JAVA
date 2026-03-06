package DSA.collection.base;
import java.util.*;
public class FlashSaleOrders {
    public static void main(String[] args) {
        Collection<Integer> ordersIds=new ArrayList<>();
        ordersIds.add(101);
        ordersIds.add(102);
        ordersIds.add(103);
        System.out.println("order recieved: " + ordersIds);
        System.out.println("no of orders: " + ordersIds.size());
    }
}
