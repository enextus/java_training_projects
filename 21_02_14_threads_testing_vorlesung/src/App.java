public class App {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("MAIN: Thread.currentThread(): " + Thread.currentThread());
        System.out.println("MAIN: Thread.activeCount(): " + Thread.activeCount());

        EchoRunnable echoRunnable1 = new EchoRunnable("D ", 360);
        EchoRunnable echoRunnable2 = new EchoRunnable("E ", 55);

        // echoRunnable.run(); // naive - wird nicht funktionieren

        Thread myThread_01 = new Thread(echoRunnable1);
        Thread myThread_02 = new Thread(echoRunnable2);

        // Thread myThread_01
        myThread_01.start();
        myThread_02.start();
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
