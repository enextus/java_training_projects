public class App {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("ThreadName: " + Thread.currentThread().getName());
        System.out.println("ActiveCount: " + Thread.activeCount());

        // Thread MAIN
        for (int i = 0; i < 5; i++) {

            Thread.sleep(250);

            System.out.println(i + " ->>>    A");
            System.out.println("");
        }
        // Thread MAIN

        EchoRunnable echoRunnable1 = new EchoRunnable("D ", 4);
        //EchoRunnable echoRunnable2 = new EchoRunnable("E ", 45);

        // echoRunnable.run(); // naive - wird nicht funktionieren

        Thread myThread_01 = new Thread(echoRunnable1);
        //Thread myThread_02 = new Thread(echoRunnable2);

        // Thread myThread_01
        myThread_01.start();
        //myThread_02.start();
        // Thread myThread_01


        System.out.println("\nMAIN done");
    }

}
