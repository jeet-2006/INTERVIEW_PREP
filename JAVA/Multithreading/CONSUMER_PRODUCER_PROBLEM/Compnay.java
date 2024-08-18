class Company {
    int n;
    //flag is needed bcz if consumer delay is more than producer then it will create mess
    //EX: producer delay:1sec and consumer: 2 sec then in 2 sec 2 producer and 1 consumer will print
    boolean flag = false;
    public synchronized void produceItem(int n) throws Exception{
        if (flag) {
            wait();
        }
        this.n = n;
        System.out.println("produced: "+ n);
        flag = true;
        notify();
    }

    public synchronized void consumeItem() throws Exception{
        if (!flag) {
            wait();
        }
        System.out.println("Consumed: "+ n);
        flag = false;
        notify();
    }
}