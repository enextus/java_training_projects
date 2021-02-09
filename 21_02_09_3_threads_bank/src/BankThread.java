public class BankThread  extends Thread implements Comparable<BankThread> {

    private final Employee employee;
    private final Integer threadName;
    private int wholeTimeForAllContracts;
    private final IntRandomNumberGenerator sequenceGenerator;

    public BankThread(Employee employee, Integer threadNumber) {
        this.employee = employee;
        this.threadName = threadNumber;
        this.sequenceGenerator = new IntRandomNumberGenerator(employee.getShortiesTime(), employee.getLongestTime());

    }

    public IntRandomNumberGenerator getSequenceGenerator() {
        return sequenceGenerator;
    }

    void setWholeTimeForAllContracts(int wholeTimeForAllContracts) {
        this.wholeTimeForAllContracts = wholeTimeForAllContracts;
    }

    @Override
    public void run() {

        randomWait();

        // some code
        System.out.println("Started!");

        this.setWholeTimeForAllContracts(this.getWholeTimeForAllContracts() + this.sequenceGenerator.nextInt());

        synchronized (this) {
            Work.bankThreadList.add(this);
        }

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
