//Demonstrate synchronization using two threads accessing a shared counter.
package assignment2.exceptionHandlingMultiThread;
class Counter {
    int count = 0;

    // Synchronized method
    synchronized void increment() {
        count++;
    }
}
class MyyThread extends Thread {
    Counter c;

    MyyThread(Counter c) {
        this.c = c;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.increment();
        }
    }
}
public class Problem6 {
    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();

        MyyThread t1 = new MyyThread(counter);
        MyyThread t2 = new MyyThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter.count);
    }
}
