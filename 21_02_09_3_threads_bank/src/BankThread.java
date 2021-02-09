
import java.util.List;

public class BankThread extends Thread implements Comparable<BankThread> {

    private final List<BankThread> bankThreadList;
    private final List<Employee> listEmployee;
    private final Integer threadName;
    private final int numberOfCompletedContracts = 20;
    private int wholeTimeForAllContracts;

    public BankThread(List<Employee> listEmployee, Integer threadNumber) {
        this.listEmployee = listEmployee;
        this.threadName = threadNumber;

        //this.bankThreadList = bankThreadList;
        this.bankThreadList = null;


        this.wholeTimeForAllContracts = 0;
    }

    int getWholeTimeForAllContracts() {
        return wholeTimeForAllContracts;
    }

    void setWholeTimeForAllContracts(int wholeTimeForAllContracts) {
        this.wholeTimeForAllContracts = wholeTimeForAllContracts;
    }

    @Override
    public void run() {

        for (int i = 0; i < this.numberOfCompletedContracts; ++i) {

            randomWait();

          //  this.setWholeTimeForAllContracts(this.getWholeTimeForAllContracts() + sequenceGenerator.nextInt());

        }

        synchronized (this) {
            bankThreadList.add(this);
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
        return this.getWholeTimeForAllContracts() - other.getWholeTimeForAllContracts();
    }

}
