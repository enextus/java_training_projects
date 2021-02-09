import java.util.List;

public class Work extends Thread {

    private int numberOfCompletedContracts = 0;

    private final List<BankThread> bankThreadList;

    public Work(int numberOfCompletedContracts) {
        this.numberOfCompletedContracts = numberOfCompletedContracts;
        this.bankThreadList = null;
    }





    @Override
    public void run() {

        randomWait();

        // some code

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

}
