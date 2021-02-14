public class App {
    public static void main(String[] args) throws InterruptedException {
        //


        EchoRunnable echoRunnable = new EchoRunnable("www");


        for (int i = 0; i < 50; i++) {

            Thread.sleep(250);

            System.out.println(i + " ->>>    A");
            System.out.println("");
        }




    }

}
