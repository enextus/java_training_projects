import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class MyTarakanThread extends Thread implements Comparable<MyTarakanThread> {

    private static int callCount = 0;
    private static long classCreationTime = 0;

    public static long getClassCreationTime() {
        return classCreationTime;
    }

    static {
        final long classCreationTime = new Date().getTime();
        setClassCreationTime(classCreationTime);
    }

    {
        callCount += 1;
    }

    private final List<MyTarakanThread> listParticipants;
    private final int shortiesTime = 50;
    private final int longestTime = 100;
    private final int minutesCount = 10;
    private final String nickname;
    private final int commonNumber;
    private final IntRandomNumberGenerator timeSequenceGenerator;
    private int wholeTimeForAllTimes;

    public MyTarakanThread(List<MyTarakanThread> masterList, String nickname) {
        this.listParticipants = masterList;
        this.nickname = nickname;
        this.commonNumber = getCallCount();
        this.timeSequenceGenerator = new IntRandomNumberGenerator(shortiesTime, longestTime);
        this.wholeTimeForAllTimes = 0;
    }

    int getWholeTimeForAllTimes() {
        return wholeTimeForAllTimes;
    }

    void setWholeTimeForAllTimes(int wholeTimeForAllTimes) {
        this.wholeTimeForAllTimes = wholeTimeForAllTimes;
    }

    static void setClassCreationTime(long classCreationTime) {
        MyTarakanThread.classCreationTime = classCreationTime;
    }

    static int getCallCount() {
        return callCount;
    }

    String getNickname() {
        return nickname;
    }

    int getCommonNumber() {
        return commonNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.minutesCount; ++i) {
            randomWait();
            this.setWholeTimeForAllTimes(this.getWholeTimeForAllTimes()
                    + timeSequenceGenerator.nextInt());
        }

        listParticipants.add(this);
    }

    private void randomWait() {
        try {
            Thread.currentThread();
            Thread.sleep((long) (3000 * Math.random()));
        } catch (InterruptedException x) {
        }
    }

    @Override
    public int compareTo(MyTarakanThread other) {
        return this.getWholeTimeForAllTimes() - other.getWholeTimeForAllTimes();
    }

    @Override
    public String toString() {
        return "MyCharThread{" +
                "times=" + minutesCount +
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
        return minutesCount == that.minutesCount && getCommonNumber() == that.getCommonNumber() && getWholeTimeForAllTimes() == that.getWholeTimeForAllTimes() && Objects.equals(getNickname(), that.getNickname()) && Objects.equals(timeSequenceGenerator, that.timeSequenceGenerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minutesCount, getNickname(), getCommonNumber(), timeSequenceGenerator, getWholeTimeForAllTimes());
    }

}
