public class App {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("MAIN: Thread.currentThread(): " + Thread.currentThread());
        System.out.println("MAIN: Thread.activeCount(): " + Thread.activeCount());

        EchoRunnable echoRunnable = new EchoRunnable("www", 100);
        Thread myThread_01 = new Thread(echoRunnable);

        myThread_01.start();

        // Thread MAIN
        for (int i = 0; i < 7; i++) {

            Thread.sleep(350);

            System.out.println(i + " ->>>    A");
            System.out.println("");
            secondPrintB();
        }
        // Thread MAIN

    }

    private static void secondPrintB() throws InterruptedException {
        Thread.sleep(10);
        System.out.println("------------------> BBBB");
    }

}
