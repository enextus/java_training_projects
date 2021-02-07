import java.util.concurrent.atomic.AtomicInteger;

public class CharThread extends Thread {

    private static final AtomicInteger callCount = new AtomicInteger(0);

    public static AtomicInteger getCallCount() {
        return callCount;
    }

    final int times;
    final char ch;
    final AtomicInteger commonNumber;

    public CharThread(int times, char ch) {
        this.times = times;
        this.ch = ch;
        this.commonNumber = getCallCount();
    }

    @Override
    public void run() {

        // Here is the logic of not-main thread
        System.out.println("Start CharThread");
        for (int i = 0; i < times; i++) {
            System.out.println(ch);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
