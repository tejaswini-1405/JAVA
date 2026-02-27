package threads;

public class FestRegistration {
    static class FormFilling extends Thread {
        public void run() {
            System.out.println("Form filling started");
        }
    }

    static class DocumentsUpload extends Thread {
        public void run() {
            System.out.println("documents upload");
        }

        static class EmailNotification extends Thread {
            public void run() {
                System.out.println("confirmation email sent");
            }
        }

        public static void main(String[] args) {
            FormFilling f=new FormFilling();
            DocumentsUpload d=new DocumentsUpload();
            EmailNotification e=new EmailNotification();
            f.start();
            d.start();
            e.start();

        }
    }
    /*
    points to remember
    ⭐java program start with one main thread
    ⭐threads allow parallel execution -> concurrency
    ⭐Output order is not guaranteed
    ⭐Threads share the same memory
    ⭐ improves the performance and responsiveness
    when start() is called, the JVM creates a new thread
    when run() is called directly, there is no concurrency
    ℹ️ process v/s thread
    ⭐process :is a running program
    ⭐thread : a path of execution insidde the program
    ⭐A process has its own memory
    ⭐thread share the same memory
    ⭐creating a thread is cheaper than creating a process
    ⭐examples: process -> chrome browser thread -> new tab
    📗closing a tab will not close chrome or kill chrome
     */

}
