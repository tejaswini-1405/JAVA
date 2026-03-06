package DSA.collection.sets;
import java.util.*;
public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> scores=new java.util.TreeSet<>(Collections.reverseOrder());//if we give collections.reverrseOrder() inside the bracket it will revrse the order
        // normally Ascending order
        scores.add(450);
        scores.add(200);
        scores.add(120);
        scores.add(195);
        scores.add(230);
        System.out.println("leader board stats: " + scores);
    }
}
