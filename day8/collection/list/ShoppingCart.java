package DSA.collection.list;
import java.util.*;
public class ShoppingCart {
    public static void main(String[] args) {
        List<String> cart=new ArrayList<>();
        cart.add("laptop");
        cart.add("Mouse");
        cart.add("keyboard");
        cart.remove("Mouse");//removes the item
        cart.set(1,"mechanical keyboard");//update
        System.out.println("Car items:" + cart);
        System.out.println("Total items: " + cart.size());
    }
}
