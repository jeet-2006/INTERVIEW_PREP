public class DemonThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i=0; i<=10; i++) {
                System.out.println("thread_1: "+ i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i=0; i<=10; i++) {
                System.out.println("thread_2: "+ i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        });
        t2.setDaemon(true);
        t1.start();
        t2.start();
    }
}
