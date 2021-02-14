public class App {
    public static void main(String[] args) throws InterruptedException {


        final Thread mainThreadLink = Thread.currentThread();

        // System.out.println(mainThreadLink.toString());

        Thread runThread = new Thread(

                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            System.out.println("Run: wait for main!");
                            mainThreadLink.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

        );

        runThread.start();

        System.out.println("Main: wait for run!");

        runThread.join();
    }

}
