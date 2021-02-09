
public class BankThread  extends Thread implements Comparable<BankThread> {

    private final Employee employee;
    private final Integer threadName;
    private int wholeTimeForAllContracts;

    public BankThread(Employee employee, Integer threadNumber) {
        this.employee = employee;
        this.threadName = threadNumber;
    }

    void setWholeTimeForAllContracts(int wholeTimeForAllContracts) {
        this.wholeTimeForAllContracts = wholeTimeForAllContracts;
    }
    @Override
    public void run() {

        randomWait();

        // some code

/*
        synchronized (this) {
            bankThreadList.add(this);
        }
*/

    }
    int getWholeTimeForAllContracts() {
        return wholeTimeForAllContracts;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Integer getThreadName() {
        return threadName;
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
