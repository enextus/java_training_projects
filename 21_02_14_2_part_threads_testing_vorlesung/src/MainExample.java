public class MainExample {
    public static void main(String[] args) {

        // A
        EchoRunnable printerA = new EchoRunnable("A", 300);
        Thread threadA = new Thread(printerA);

        threadA.start();


    }
}
