package deadlock;

public class ThreadWithPrioprity extends Thread{
    public void run(){
        for(int i=1; i<=3 ;i++){
            System.out.println(Thread.currentThread().getName() + " | Priority" + Thread.currentThread().getPriority());
        }
    }

    public static void main(String[] args) {
        ThreadWithPrioprity t1=new ThreadWithPrioprity();
        ThreadWithPrioprity t2=new ThreadWithPrioprity();
        ThreadWithPrioprity t3=new ThreadWithPrioprity();
        t1.setName("low priority thread");
        t2.setName("Medium priority thread");
        t3.setName("high priority thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        //t3.setPriority(11);//IllegalArgumentException
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
ℹ️ Points to remember:
⭐ Thread priority is only a suggestion to the JVM or the scheduler.
⭐ Higher priority doesn't guarantee execution order.
⭐ Higher priority threads may get more CPU scheduler time.
⭐ The actual behaviour depends on the JVM & Operating system
 */
