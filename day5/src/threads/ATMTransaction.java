package threads;

public class ATMTransaction extends Thread{
    public void run(){
        System.out.println("processing ATM transaction");
    }

    public static void main(String[] args) {
        ATMTransaction t=new ATMTransaction();
        System.out.println(" Thread state: " + t.getState());//new
        t.start();
        System.out.println(" Thread state after start " + t.getState());//runnable
    }
}
/*
ℹ️ Code explanation:
Intially the thread is in the NEW state, After calling start(),
it moves to RUNNABLE and executes the run() method.
The exact timing of the state changes depends on th HVM Scheduler

ℹ️ points to remember:
⭐ thread is vreated once
⭐ Start() change state
⭐ Thread cannot be restarted
⭐ Final state is TERMINATED or DEAD
 */
