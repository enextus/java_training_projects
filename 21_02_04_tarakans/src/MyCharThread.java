import java.util.Date;

public class MyCharThread extends Thread {

    public static int callCount = 0;
    public static long classCreationTime = 0;

    // This static block will be executed if the class CharThread will be loaded by JVM;
    static {
        final long classCreationTime = new Date().getTime();
        setClassCreationTime(classCreationTime);

        System.out.println("0. - " + classCreationTime + " - was executed.\n");
    }

    // This non-static block will be executed if an instance will be created;
    {
        callCount += 1;
    }

    final int times;
    final char ch;
    final int commonNumber;

    public MyCharThread(int times, char ch) {
        this.times = times;
        this.ch = ch;
        this.commonNumber = getCallCount();
    }

    public static void setClassCreationTime(long classCreationTime) {
        MyCharThread.classCreationTime = classCreationTime;
    }

    public static int getCallCount() {
        return callCount;
    }

    public char getCh() {
        return this.ch;
    }

    public int getCommonNumber() {
        return this.commonNumber;
    }



    @Override
    public void run() {

        IntRandomNumberGenerator timeSequenceGenerator = new IntRandomNumberGenerator(50, 100);

        // Here is the logic of not-main thread!!!
        System.out.println("Start CharThread.");

        for (int i = 0; i < times; i++) {


            System.out.println("commonNumber: " + getCommonNumber());
            System.out.println("ch: " + getCh());


            int timeNeededForOneCm = timeSequenceGenerator.nextInt();

            System.out.println("timeNeededForOneCm: " + timeNeededForOneCm + " milliseconds");

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
