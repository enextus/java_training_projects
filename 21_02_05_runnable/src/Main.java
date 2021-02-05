public class Main {

    public static void main(String[] args) throws InterruptedException {

        MyRunnable myr = new MyRunnable();

        Thread thr1 = new Thread(myr);
        thr1.start();

        Thread childTread = new Thread(myr);
        childTread.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("m" + i);
            Thread.sleep(1000);
        }

        childTread.join();
        System.out.println("End");
    }

}
