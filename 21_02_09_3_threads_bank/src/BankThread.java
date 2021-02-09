
import java.util.List;

public class BankThread extends Thread implements Comparable<BankThread> {

    private final List<BankThread> bankThreadList;

    private final List<Employee> listEmployee;

    private final int numberOfCompletedContracts = 10;
    private int wholeTimeForAllContracts;

    public BankThread(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;


        this.bankThreadList = bankThreadList;


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
