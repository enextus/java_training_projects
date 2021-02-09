
import java.util.List;

public class BankThread{

    private final Employee employee;
    private final Integer threadName;

    public BankThread(Employee employee, Integer threadNumber) {
        this.employee = employee;
        this.threadName = threadNumber;
    }


    public Employee getEmployee() {
        return employee;
    }

    public Integer getThreadName() {
        return threadName;
    }
}
