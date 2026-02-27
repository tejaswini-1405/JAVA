package threads;

public class ResultDeclaration {
    synchronized void declaredResult() throws Exception{
        System.out.println("waiting for approval");
        wait();
        System.out.println("result declared");
    }
    synchronized void approve(){
        notify();
    }

    public static void main(String[] args) throws Exception {
        ResultDeclaration rd=new ResultDeclaration();
        new Thread(() -> {
                    try{
                        rd.declaredResult();
                    }catch(Exception e){}
                }).start();
        Thread.sleep(2000);
        new Thread(() ->
            rd.approve()).start();
    }
}
/*
the declareResult() method waits until another thread calls notify().
during wait(), the thread releases the lock,allowing other threads to enter the synchronized code.

ℹ️ points to remember
⭐ sleep() -> time based
⭐ wait() -> condidition based
⭐ wait() -> releases lock -> by checking the notify() method
⭐ wait() -> is used in inter threaded communication
☑️order - placed -> preparing -> -> prepared -> delivering -> delivered
Race condition// deadlock
 */