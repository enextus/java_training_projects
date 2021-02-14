public class App {
    public static void main(String[] args) throws InterruptedException {

        Thread myThread_01 = Thread.currentThread();
        myThread_01.join(); // stopt thread aus dem der Thread war gestartet  DEATH LOOK

        System.out.println("weiter main ");

        System.out.println("\nMAIN done");

    }

}
