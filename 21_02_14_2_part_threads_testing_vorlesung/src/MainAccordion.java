public class MainAccordion {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            // A
            AccordionRunnable printerA = new AccordionRunnable("A", 250);
            Thread threadA = new Thread(printerA);

            threadA.start();

            // B
            AccordionRunnable printerB = new AccordionRunnable("B", 250);
            Thread threadB = new Thread(printerB);

            threadB.start();

            threadA.join();
            System.out.println(" ->    Thread " + Thread.currentThread().getName() + " läuft weiter....\n");

            threadB.join();
            System.out.println(" ->    Thread " + Thread.currentThread().getName() + " läuft weiter....\n");

            System.out.println("C ");
        }







    }

}
