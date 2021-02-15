public class MainAccordion {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 3; i++) {
            // A
            AccordionRunnable printerA = new AccordionRunnable("A   .", 150);
            Thread threadA = new Thread(printerA);

            threadA.start();

            // B
            AccordionRunnable printerB = new AccordionRunnable(".   B", 150);
            Thread threadB = new Thread(printerB);

            threadB.start();

            threadA.join();
            threadB.join();

            // C
            System.out.println("--------------");
            for (int j = 0; j < 3; j++) {
                System.out.println("C ");
            }
            System.out.println("--------------");
        }
    }

}
