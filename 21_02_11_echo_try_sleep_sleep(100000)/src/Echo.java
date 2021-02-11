public class Echo implements Runnable {

    private String message;

    public Echo(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        while (true) {

            // Some complex logic lasting long time
            try {

                System.out.println("Thread.currentThread(): " + Thread.currentThread());
                System.out.println("Thread.class: " + Thread.class);
                System.out.println("Thread.activeCount(): " + Thread.activeCount());
                System.out.println("Thread.activeCount(): " + Thread.activeCount());

                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(message);
            }
        }
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
