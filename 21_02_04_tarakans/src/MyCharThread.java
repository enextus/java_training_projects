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
    final String nickname;
    final int commonNumber;
    final IntRandomNumberGenerator timeSequenceGenerator;
    int wholeTimeForAllTimes;

    public MyCharThread(int times, String nickname) {
        this.times = times;
        this.nickname = nickname;
        this.commonNumber = getCallCount();
        this.timeSequenceGenerator = new IntRandomNumberGenerator(50, 100);
        this.wholeTimeForAllTimes = 0;
    }

    public int getWholeTimeForAllTimes() {
        return wholeTimeForAllTimes;
    }

    public void setWholeTimeForAllTimes(int wholeTimeForAllTimes) {
        this.wholeTimeForAllTimes = wholeTimeForAllTimes;
    }

    public static void setClassCreationTime(long classCreationTime) {
        MyCharThread.classCreationTime = classCreationTime;
    }

    public static int getCallCount() {
        return callCount;
    }

    public String getNickname() {
        return this.nickname;
    }

    public int getCommonNumber() {
        return this.commonNumber;
    }



    @Override
    public void run() {

        // Here is the logic of not-main thread!!!
        System.out.println("Start CharThread.");

        for (int i = 0; i < this.times; i++) {

            System.out.println("commonNumber: " + getCommonNumber());
            System.out.println("nickname: " + getNickname());

            int timeNeededForOneCm = timeSequenceGenerator.nextInt();

            System.out.println("timeNeededForOneCm: " + timeNeededForOneCm + " milliseconds");

            int temp = this.getWholeTimeForAllTimes();
            this.setWholeTimeForAllTimes(temp + timeNeededForOneCm);

            System.out.println("Whole time now: " + this.getWholeTimeForAllTimes() + " milliseconds");


            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
