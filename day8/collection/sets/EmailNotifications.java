package DSA.collection.sets;
import java.util.*;
import java.util.HashSet;

public class EmailNotifications {
    public static void main(String[] args) {
        Set<String> emailQueue=new HashSet<>();
        emailQueue.add("a@gmail.com");
        emailQueue.add("b@gmail.com");
        emailQueue.add("b@gmail.com");
        emailQueue.add("d@gmail.com");
        emailQueue.add("e@gmail.com");
        emailQueue.add("f@gmail.com");
        System.out.println("emails to send: " + emailQueue);
        System.out.println("Unique emails: " + emailQueue.size());
    }
}
