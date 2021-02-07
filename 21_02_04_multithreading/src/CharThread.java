public class CharThread extends Thread {

    public static int callCount = 0;

    // Instead of performing increment in the constructor instance block is preferred to make this program generic;
    // This non-static block will be executed if an instance will be created;
    {
        callCount += 1;
        System.out.println("1. here was executed");
    }

    // This static block will be executed if the class CharThread will be loaded by JVM;
    static {
        System.out.println("0. here was executed");
    }

    final int times;
    final char ch;
    final int commonNumber;

    public CharThread(int times, char ch) {
        this.times = times;
        this.ch = ch;
        this.commonNumber = getCallCount();
    }

    public static int getCallCount() {
        return callCount;
    }

    public char getCh() {
        return ch;
    }

    public int getCommonNumber() {
        return commonNumber;
    }

    @Override
    public void run() {

        // Here is the logic of not-main thread
        System.out.println("Start CharThread");

        for (int i = 0; i < times; i++) {

            System.out.println("commonNumber: " + getCommonNumber());
            System.out.println("ch: " + getCh());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
