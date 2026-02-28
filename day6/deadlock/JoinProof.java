package deadlock;

public class JoinProof {
    static class Task extends Thread {
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {}
                System.out.println("task Finished");
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Task t = new Task();
            t.start();//the main thread doesn't wait for this thread
            t.join();//add thorws//code will wait(guaranted!)
            System.out.println("main thread resumes");
        }
    }
