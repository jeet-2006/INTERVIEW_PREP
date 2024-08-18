import java.sql.SQLOutput;

public class producer extends Thread {
    Company c;
    producer(Company c) {
        this.c = c;
    }
    public void run() {
        int i=1;
        while (i<10) {
            try {
                c.produceItem(i++);
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
