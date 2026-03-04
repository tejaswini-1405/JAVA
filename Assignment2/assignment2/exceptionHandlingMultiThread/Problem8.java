//Write a program to demonstrate thread life cycle states
package assignment2.exceptionHandlingMultiThread;
class ThreadLifeCycle extends Thread {

    public void run() {
        System.out.println("Thread is in RUNNING state");
        try {
            Thread.sleep(1000); // Thread goes to TIMED_WAITING state
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread execution finished");
    }
}
public class Problem8 {
    public static void main(String[] args) {

        ThreadLifeCycle t1 = new ThreadLifeCycle();

        // NEW state
        System.out.println("State after creation: " + t1.getState());

        // RUNNABLE state
        t1.start();
        System.out.println("State after start(): " + t1.getState());

        try {
            Thread.sleep(500);
        } catch (Exception e) {}

        // State while running
        System.out.println("State during execution: " + t1.getState());

        try {
            t1.join();
        } catch (Exception e) {}

        // TERMINATED state
        System.out.println("State after completion: " + t1.getState());
    }
}
