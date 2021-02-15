public class MainAccordion {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            // A
            AccordionRunnable printerA = new AccordionRunnable("A   .", 100);
            Thread threadA = new Thread(printerA);

            // B
            AccordionRunnable printerB = new AccordionRunnable(".   B", 99);
            Thread threadB = new Thread(printerB);

            threadA.start();
            threadB.start();

            threadA.join();
            threadB.join();

            // C
            line();

            AccordionRunnable printerC = new AccordionRunnable("   C", 100);
            Thread threadC = new Thread(printerC);

            threadC.run();
            // threadC.join();

            line();
        }
    }

    public static void line() {
        System.out.println("--------------");
    }

}
