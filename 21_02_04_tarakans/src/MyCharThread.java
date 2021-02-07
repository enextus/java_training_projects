import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MyCharThread extends Thread implements Comparable<MyCharThread> {

    public static int callCount = 0;
    public static long classCreationTime = 0;

    public static List<MyCharThread> listOfTarakans = new ArrayList<>();

    static {
        final long classCreationTime = new Date().getTime();
        setClassCreationTime(classCreationTime);
    }

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
        return nickname;
    }

    public int getCommonNumber() {
        return commonNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.times; i++) {
            this.setWholeTimeForAllTimes(this.getWholeTimeForAllTimes() + timeSequenceGenerator.nextInt());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("Nickname: " + this.getNickname() + ", Time: " + this.getWholeTimeForAllTimes() + " milliseconds.");
    }

    @Override
    public int compareTo(MyCharThread other) {
        return this.wholeTimeForAllTimes - other.wholeTimeForAllTimes;
    }

    @Override
    public String toString() {
        return "MyCharThread{" +
                "times=" + times +
                ", nickname='" + nickname + '\'' +
                ", commonNumber=" + commonNumber +
                ", timeSequenceGenerator=" + timeSequenceGenerator +
                ", wholeTimeForAllTimes=" + wholeTimeForAllTimes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyCharThread)) return false;
        MyCharThread that = (MyCharThread) o;
        return times == that.times && getCommonNumber() == that.getCommonNumber() && getWholeTimeForAllTimes() == that.getWholeTimeForAllTimes() && Objects.equals(getNickname(), that.getNickname()) && Objects.equals(timeSequenceGenerator, that.timeSequenceGenerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(times, getNickname(), getCommonNumber(), timeSequenceGenerator, getWholeTimeForAllTimes());
    }
}
