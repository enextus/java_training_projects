import java.util.List;

public class Work extends Thread implements Comparable<BankThread> {

    private int numberOfCompletedContracts = 0;
    private int wholeTimeForAllContracts;
    private final List<BankThread> bankThreadList;
    private final List<Employee> listEmployee;


    public Work(int numberOfCompletedContracts) {
        this.numberOfCompletedContracts = numberOfCompletedContracts;
        this.bankThreadList = null;
    }

    int getWholeTimeForAllContracts() {
        return wholeTimeForAllContracts;
    }



    void setWholeTimeForAllContracts(int wholeTimeForAllContracts) {
        this.wholeTimeForAllContracts = wholeTimeForAllContracts;
    }



    @Override
    public void run() {

        randomWait();

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
