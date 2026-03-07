//Write a program to illustrate deadlock concept (demonstration code).
package assignment2.exceptionHandlingMultiThread;

class DeadlockDemo {
    static final Object resource1 = new Object();
    static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1 locked Resource 1");

                    try { Thread.sleep(100); } catch (Exception e) {}

                    synchronized (resource2) {
                        System.out.println("Thread 1 locked Resource 2");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2 locked Resource 2");

                    try { Thread.sleep(100); } catch (Exception e) {}

                    synchronized (resource1) {
                        System.out.println("Thread 2 locked Resource 1");
                    }
                }
            }
        };

        t1.start();
        t2.start();
    }
}