public class AccordionRunnable implements Runnable {

    private String message;
    private final long sleepMillis;

    public AccordionRunnable(String message, long sleepMillis) {
        this.message = message;
        this.sleepMillis = sleepMillis;
        this.setMessage(this.getMessage());
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < 3; i++) {
                Thread.sleep(sleepMillis);
                System.out.print(message + " <-- ");
                System.out.println(Thread.currentThread().getName());
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
            // e.printStackTrace();
        }

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Echo{" +
                "message='" + message + '\'' +
                '}';
    }

}
