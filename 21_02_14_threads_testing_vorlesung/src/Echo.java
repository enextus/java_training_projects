public class Echo implements Runnable {

    {
        System.out.println("1 -> " + this.getMessage());
    }

    private String message;

    public Echo(String message) {
        this.message = message;
        this.setMessage(this.getMessage());
    }

    @Override
    public void run() {

/*        while (true) {

            // Some complex logic lasting long time
            try {

                System.out.println("Thread.currentThread(): " + Thread.currentThread());
                System.out.println("Thread.class: " + Thread.class);
                System.out.println("Thread.activeCount(): " + Thread.activeCount());

                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(message);
            }

        }*/


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
