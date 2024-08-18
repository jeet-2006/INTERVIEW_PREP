class MyRunnable implements Runnable {
    String lock = "L";
    private static int currentNumber = 1;
    private final String name;
    private final int threadId;

    public MyRunnable(String name, int threadId) {
        this.name = name;
        this.threadId = threadId;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (currentNumber > 10) {
                    break;
                }
                if ((currentNumber - 1) % 3 == threadId) {
                    System.out.println(name + ": " + currentNumber);
                    currentNumber++;
                    lock.notifyAll();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class PrintThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable("t1", 0));
        Thread t2 = new Thread(new MyRunnable("t2", 1));
        Thread t3 = new Thread(new MyRunnable("t3", 2));

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
