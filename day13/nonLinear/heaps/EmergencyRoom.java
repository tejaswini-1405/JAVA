package DSA.nonLinear.heaps;
import java.util.*;
public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity=new PriorityQueue<>();
        //1->High priority
        //2->Low Priority
        //3->medium priority
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("The patient that gets operated first is patient " + severity.poll());
        System.out.println("Patient in queue: " + severity);
    }
}
