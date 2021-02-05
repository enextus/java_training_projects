import java.util.Date;

class MyRunnable implements Runnable {

    Thread thread;
    final String tag = "21-02-05 - ";
    long startTime;

    public MyRunnable(long startTime) {
        this.startTime = getStartTime();

        // second
        // thread = new Thread(this, "first thread");
        // System.out.println(tag + "first thread " + thread + "\n");
        // thread.start(); // start of first thread
    }

    public long getStartTime() {
        return new Date().getTime();
    }

    @Override
    public void run() {

        System.out.println("Start thread: ");

        try {
            for (int i = 3; i > 0; i--) {
                System.out.println(tag + "thread: " + i + ", time: " + getStartTime());
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("e: " + e + "\n");
            System.out.println(tag + "thread was broken");
            
        }
    }

}
