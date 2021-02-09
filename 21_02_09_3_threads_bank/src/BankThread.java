
import java.util.List;

public class BankThread extends Thread implements Comparable<BankThread> {

    private final List<BankThread> listEmployee;
    private final int shortiesTime = 100;
    private final int longestTime = 200;
    private final int minutesCount = 10;
    private final String nickname;
    private final IntRandomNumberGenerator sequenceGenerator;
    private int wholeTimeForAllTimes;

    public BankThread(List<BankThread> listEmployee, String nickname) {
        this.listEmployee = listEmployee;
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
            listEmployee.add(this);
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
    public int compareTo(BankThread other) {
        return this.getWholeTimeForAllTimes() - other.getWholeTimeForAllTimes();
    }

}
