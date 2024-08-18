public class ThreadSafe {
    private static ThreadSafe ts;

    private ThreadSafe(){}

    public static  ThreadSafe getThreadSafe() {
        if (ts == null) {
            synchronized (ThreadSafe.class) {
                if (ts == null) {
                    ts = new ThreadSafe();
                }
            }
        }
        return ts;
    }
}
