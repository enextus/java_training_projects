public class MainExample {
    public static void main(String[] args) throws InterruptedException {

        // A
        EchoRunnable printerA = new EchoRunnable("A", 250);
        Thread threadA = new Thread(printerA);

        threadA.start();

        // B
        EchoRunnable printerB = new EchoRunnable("B", 955);
        Thread threadB = new Thread(printerB);

        threadB.start();

        threadA.join();
        System.out.println(" ->    Thread " + Thread.currentThread().getName() + " läuft weiter....\n");


        threadB.join();
        System.out.println(" ->    Thread " + Thread.currentThread().getName() + " läuft weiter....\n");


    }

}
