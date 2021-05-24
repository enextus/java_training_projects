package transaction;

import java.time.ZonedDateTime;


public class Transaction {

    private final String uuid;
    private State state;
    private final long sum;
    private final ZonedDateTime time;

    public Transaction(String uuid, State state, long sum) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.time = ZonedDateTime.now();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "uuid='" + uuid + '\'' +
                ", state=" + state +
                ", sum=" + sum +
                ", time=" + time +
                '}';
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public long getSum() {
        return sum;
    }

    public ZonedDateTime getTime() {
        return time;
    }

}
