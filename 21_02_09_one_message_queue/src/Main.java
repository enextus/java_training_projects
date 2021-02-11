
public class Main {

    public static void main(String[] args) {




        MessageSupplier messageSupplier = new MessageSupplier();
        OneItemStringQueue oneItemStringQueue = new OneItemStringQueue();
        messageSupplier.start();



        //TODO create here several consumer threads and one supplier thread and start them.
    }

}






/*
    Echo echo = new Echo("Hello!");

        System.out.println(echo);

                Thread echoTh = new Thread(echo);
                echoTh.start();
*/
