public class Consumer extends Thread{
    Company c;
    Consumer(Company c) {
        this.c = c;
    }
    public void run() {
        while (true) {
            try {
                c.consumeItem();
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

}
