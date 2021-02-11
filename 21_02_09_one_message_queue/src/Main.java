
public class Main {

    public static void main(String[] args) {

        OneItemStringQueue queue = new OneItemStringQueue();

        Thread consumerThread1 = new Thread(new MessageSupplier(queue));
        Thread consumerThread2 = new Thread(new MessageSupplier(queue));
        Thread consumerThread3 = new Thread(new MessageSupplier(queue));


        Thread supplierThread = new Thread(new MessageSupplier(queue));

        consumerThread1.setDaemon(true);
        consumerThread2.setDaemon(true);
        consumerThread3.setDaemon(true);

        consumerThread1.start();
        consumerThread2.start();
        consumerThread3.start();

        supplierThread.start();

        // TODO create here several consumer threads and one supplier thread and start them.
    }

}






/*
    Echo echo = new Echo("Hello!");

        System.out.println(echo);

                Thread echoTh = new Thread(echo);
                echoTh.start();
*/
