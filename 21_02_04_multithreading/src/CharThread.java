public class CharThread extends Thread {

    public static int callCount = 0;

    // Instead of performing increment in the constructor instance block is preferred to make this program generic.
    {
        callCount += 1;
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

    public int getCommonNumber() {
        return commonNumber;
    }

    @Override
    public void run() {

        // Here is the logic of not-main thread
        System.out.println("Start CharThread");
        for (int i = 0; i < times; i++) {
            System.out.println(times);
            System.out.println(ch);
            System.out.println(commonNumber);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
