import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MyTarakanThread extends Thread implements Comparable<MyTarakanThread> {

    public static int callCount = 0;
    public static long classCreationTime = 0;

    static {
        final long classCreationTime = new Date().getTime();
        setClassCreationTime(classCreationTime);
    }

    {
        callCount += 1;
    }

    public static List<MyTarakanThread> listOfTarakans = new ArrayList<>();
    private List<MyTarakanThread> list;
    int shortiesTime = 50;
    int longestTime = 100;
    final int times = 10;
    final String nickname;
    final int commonNumber;
    final IntRandomNumberGenerator timeSequenceGenerator;
    int wholeTimeForAllTimes;

    public MyTarakanThread(List<MyTarakanThread> masterList, String nickname) {
        this.list = masterList;
        this.nickname = nickname;
        this.commonNumber = getCallCount();
        this.timeSequenceGenerator = new IntRandomNumberGenerator(shortiesTime, longestTime);
        this.wholeTimeForAllTimes = 0;
    }

    public int getWholeTimeForAllTimes() {
        return wholeTimeForAllTimes;
    }

    public void setWholeTimeForAllTimes(int wholeTimeForAllTimes) {
        this.wholeTimeForAllTimes = wholeTimeForAllTimes;
    }

    public static void setClassCreationTime(long classCreationTime) {
        MyTarakanThread.classCreationTime = classCreationTime;
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

        for (int i = 0; i < this.times; ++i) {
            randomWait();
            this.setWholeTimeForAllTimes(this.getWholeTimeForAllTimes() + timeSequenceGenerator.nextInt());
        }

        list.add(this);
    }

    private void randomWait() {
        try {
            Thread.currentThread();
            Thread.sleep((long) (3000 * Math.random()));
        } catch (InterruptedException x) {
        }
    }

    public static List<MyTarakanThread> getListOfTarakans() {
        return listOfTarakans;
    }

    @Override
    public int compareTo(MyTarakanThread other) {
        return this.getWholeTimeForAllTimes() - other.getWholeTimeForAllTimes();
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
        if (!(o instanceof MyTarakanThread)) return false;
        MyTarakanThread that = (MyTarakanThread) o;
        return times == that.times && getCommonNumber() == that.getCommonNumber() && getWholeTimeForAllTimes() == that.getWholeTimeForAllTimes() && Objects.equals(getNickname(), that.getNickname()) && Objects.equals(timeSequenceGenerator, that.timeSequenceGenerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(times, getNickname(), getCommonNumber(), timeSequenceGenerator, getWholeTimeForAllTimes());
    }

}
