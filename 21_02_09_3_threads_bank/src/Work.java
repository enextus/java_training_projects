import java.util.List;

public class Work{

    private int numberOfCompletedContracts = 0;

    static   List<BankThread> bankThreadList;

    public Work(int numberOfCompletedContracts) {
        this.numberOfCompletedContracts = numberOfCompletedContracts;
        bankThreadList = null;
    }


    public int getNumberOfCompletedContracts() {
        return numberOfCompletedContracts;
    }

    public List<BankThread> getBankThreadList() {
        return bankThreadList;
    }
}
