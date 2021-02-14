public class EchoRunnable implements Runnable {

    private String message;

/*    {
        System.out.println("->> hier wird { im EchoRunnable } abgearbeitet");
        System.out.println("");
    }*/

    public EchoRunnable(String message) {
        this.message = message;
        this.setMessage(this.getMessage());
    }

    @Override
    public void run() {

        System.out.println("myThread_01: Thread.currentThread(): " + Thread.currentThread());
        System.out.println("myThread_01: Thread.activeCount(): " + Thread.activeCount());

        for (int i = 150; i < 156; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(i + " ->>>>>>>>>    B");
            System.out.println("");
        }

/*        while (true) {
            // Some complex logic lasting long time
            try {

                System.out.println("Thread.currentThread(): " + Thread.currentThread());
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
