public class Main {

    public static void main(String[] args) throws InterruptedException {
        // write your code here

        for (int i = 0; i < 50; i++) {

            for (int j = 0; j < 1000000000L; j++) {
                // do nothing
            }

            //Thread.sleep(250);

            System.out.println(i + " ->>>    A");
            System.out.println("");
        }
    }

}
