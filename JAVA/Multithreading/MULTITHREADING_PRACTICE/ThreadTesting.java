public class ThreadTesting{

    public static void main(String[] args) throws InterruptedException {
        Test t = new Test();
        Test t3 = new Test();
        t.start();
        t3.start();
        TestRunnable t1 = new TestRunnable();
        Thread t2 = new Thread(t1);
        t2.start();
        //it will create last in case of run.
    }

}

class Test extends Thread{

    public synchronized void run() {
        System.out.println("running");
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class TestRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("running Runnable");
    }
}