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
    private final long instanceCreationTime;
    private int wholeTimeForAllTimes;
    private int wholeTimeForAllRealTimes;

    public MyTarakanThread(List<MyTarakanThread> masterList, String nickname) {
        this.listParticipants = masterList;
        this.nickname = nickname;
        this.commonNumber = getCallCount();
        this.timeSequenceGenerator = new IntRandomNumberGenerator(shortiesTime, longestTime);
        this.instanceCreationTime = new Date().getTime();
        this.wholeTimeForAllTimes = 0;
        this.wholeTimeForAllRealTimes = 0;
    }

    public void setWholeTimeForAllRealTimes(int wholeTimeForAllRealTimes) {
        this.wholeTimeForAllRealTimes = wholeTimeForAllRealTimes;
    }

    public int getWholeTimeForAllRealTimes() {
        return wholeTimeForAllRealTimes;
    }

    public long getInstanceCreationTime() {
        return instanceCreationTime;
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

            System.out.println(" ----> " + this.getWholeTimeForAllTimes());

            int temp = timeSequenceGenerator.nextInt();
            System.out.println("" + i + ":: " + " --> " + temp);

            this.setWholeTimeForAllTimes(
                    this.getWholeTimeForAllTimes() + temp);

        }

        int result = (int) (System.currentTimeMillis() - this.getInstanceCreationTime());
        this.setWholeTimeForAllRealTimes(result);
        listParticipants.add(this);
    }

    private void randomWait() {
        try {
            Thread.currentThread();
            Thread.sleep((long) (1000 * Math.random()));
        } catch (InterruptedException x) {
        }
    }

    @Override
    public int compareTo(MyTarakanThread other) {
        return this.getWholeTimeForAllTimes() - other.getWholeTimeForAllTimes();
    }

    @Override
    public String toString() {
        return "MyTarakanThread{" +
                "listParticipants=" + listParticipants +
                ", shortiesTime=" + shortiesTime +
                ", longestTime=" + longestTime +
                ", minutesCount=" + minutesCount +
                ", nickname='" + nickname + '\'' +
                ", commonNumber=" + commonNumber +
                ", timeSequenceGenerator=" + timeSequenceGenerator +
                ", instanceCreationTime=" + instanceCreationTime +
                ", wholeTimeForAllTimes=" + wholeTimeForAllTimes +
                ", wholeTimeForAllRealTimes=" + wholeTimeForAllRealTimes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTarakanThread)) return false;
        MyTarakanThread that = (MyTarakanThread) o;
        return shortiesTime == that.shortiesTime && longestTime == that.longestTime && minutesCount == that.minutesCount && getCommonNumber() == that.getCommonNumber() && getInstanceCreationTime() == that.getInstanceCreationTime() && getWholeTimeForAllTimes() == that.getWholeTimeForAllTimes() && getWholeTimeForAllRealTimes() == that.getWholeTimeForAllRealTimes() && Objects.equals(listParticipants, that.listParticipants) && Objects.equals(getNickname(), that.getNickname()) && Objects.equals(timeSequenceGenerator, that.timeSequenceGenerator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listParticipants, shortiesTime, longestTime, minutesCount, getNickname(), getCommonNumber(), timeSequenceGenerator, getInstanceCreationTime(), getWholeTimeForAllTimes(), getWholeTimeForAllRealTimes());
    }
}
