public class App {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("ThreadName: " + Thread.currentThread().getName());
        System.out.println("ActiveCount: " + Thread.activeCount());

        EchoRunnable echoRunnable1 = new EchoRunnable("Second thread ", 100);
        //EchoRunnable echoRunnable2 = new EchoRunnable("E ", 45);

        // echoRunnable.run(); // naive - wird nicht funktionieren

        Thread myThread_01 = new Thread(echoRunnable1);
        //Thread myThread_02 = new Thread(echoRunnable2);

        // Thread myThread_01
        myThread_01.start();
        //myThread_02.start();
        // Thread myThread_01

        System.out.println("stop main");
        myThread_01.join(); // stopt thread aus dem der Thread war gestartet
        System.out.println("weiter main ");

        // Thread MAIN
        for (int i = 0; i < 4; i++) {

            Thread.sleep(100);

            System.out.println(i + " ->>>    A");
            System.out.println("");
        }
        // Thread MAIN





        System.out.println("\nMAIN done");
    }

}
