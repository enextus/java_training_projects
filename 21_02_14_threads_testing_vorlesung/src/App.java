public class App {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("MAIN: Thread.currentThread(): " + Thread.currentThread());
        System.out.println("MAIN: Thread.activeCount(): " + Thread.activeCount());

        EchoRunnable echoRunnable = new EchoRunnable("www", 2000);
        Thread myThread_01 = new Thread(echoRunnable);

        // Thread myThread_01
        myThread_01.start();
        // Thread myThread_01

        // Thread MAIN
        for (int i = 0; i < 5; i++) {

            Thread.sleep(200);

            System.out.println(i + " ->>>    A");
            System.out.println("");
        }
        // Thread MAIN

    }

}
