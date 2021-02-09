
public class BankThread implements Comparable<BankThread> {

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

    int getWholeTimeForAllContracts() {
        return wholeTimeForAllContracts;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Integer getThreadName() {
        return threadName;
    }

    @Override
    public int compareTo(BankThread other) {
        return this.getWholeTimeForAllContracts() - other.getWholeTimeForAllContracts();

    }

}
