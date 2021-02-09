public class BankThread  extends Thread implements Comparable<BankThread> {

    private final Employee employee;
    private final Integer threadName;
    private final IntRandomNumberGenerator sequenceGenerator;
    private final IntRandomNumberGenerator sequenceGeneratorTurbo;

    public BankThread(Employee employee, Integer threadNumber) {
        this.employee = employee;
        this.threadName = threadNumber;
        this.sequenceGenerator = new IntRandomNumberGenerator(employee.getShortiesTime(), employee.getLongestTime());
        this.sequenceGeneratorTurbo = new IntRandomNumberGenerator(50, 100);;

    }

    public IntRandomNumberGenerator getSequenceGenerator() {
        return sequenceGenerator;
    }

    @Override
    public void run() {

        randomWait();

        System.out.println("Started!");

        if (this.getEmployee().isTurboPossibility()) {

            int time = sequenceGeneratorTurbo.nextInt();
            this.getEmployee().setWholeTimeForAllContracts(this.getEmployee().getWholeTimeForAllContracts() + time);

        } else {

            this.getEmployee().setWholeTimeForAllContracts(this.getEmployee().getWholeTimeForAllContracts() + this.sequenceGenerator.nextInt());
        }

        synchronized (this) {
            Work.bankThreadList.add(this);
        }

    }

    @Override
    public int compareTo(BankThread other) {
        return this.getEmployee().getWholeTimeForAllContracts() - other.getEmployee().getWholeTimeForAllContracts();

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

}
