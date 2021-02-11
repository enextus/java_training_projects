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

}
