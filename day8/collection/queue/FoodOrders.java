package DSA.collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class FoodOrders {
    public static void main(String[] args) {
        Queue<String> orders=new LinkedList<>();
        //for adding - add() [fail][strict],offer() [not fail][not strict]
        orders.add("order101");//strict capacity based
        orders.offer("order102");//flexible
        System.out.println("Orders" + orders);
        //for removal:remove()-> strict[fail] ,poll() not strict[NotFail]
        System.out.println("Serving: "+ orders.poll());//if nulll if show null..but remove show exception if it is empty
        System.out.println("Pending order: " + orders);
        System.out.println("Serving: "+ orders.remove());
        System.out.println("Pending order: " + orders);
    }
}
