
import java.util.List;

public class MyTarakanThread extends Thread implements Comparable<MyTarakanThread> {

    private final List<MyTarakanThread> listParticipants;
    private final int shortiesTime = 50;
    private final int longestTime = 100;
    private final int minutesCount = 10;
    private final String nickname;
    private final IntRandomNumberGenerator sequenceGenerator;
    private int wholeTimeForAllTimes;

    public MyTarakanThread(List<MyTarakanThread> masterList, String nickname) {
        this.listParticipants = masterList;
        this.nickname = nickname;
        this.sequenceGenerator = new IntRandomNumberGenerator(shortiesTime, longestTime);
        this.wholeTimeForAllTimes = 0;
    }

    int getWholeTimeForAllTimes() {
        return wholeTimeForAllTimes;
    }

    void setWholeTimeForAllTimes(int wholeTimeForAllTimes) {
        this.wholeTimeForAllTimes = wholeTimeForAllTimes;
    }

    String getNickname() {
        return nickname;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.minutesCount; ++i) {

            randomWait();

            this.setWholeTimeForAllTimes(
                    this.getWholeTimeForAllTimes() + sequenceGenerator.nextInt());

        }

        synchronized (this) {
            listParticipants.add(this);
        }

    }

    private void randomWait() {
        try {
            Thread.currentThread();
            Thread.sleep((long) (1000 * Math.random()));
        } catch (InterruptedException x) {
            System.out.println("Thread  interrupted.");
        }
    }

    @Override
    public int compareTo(MyTarakanThread other) {
        return this.getWholeTimeForAllTimes() - other.getWholeTimeForAllTimes();
    }

}
