public class Main {
    public static void main(String args[]) {
        Company c = new Company();
        producer p = new producer(c);
        Consumer con = new Consumer(c);
        p.start();
        con.start();
    }
}
