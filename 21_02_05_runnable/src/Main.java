import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start Main.");

        MyRunnable myr = new MyRunnable(new Date().getTime());

        Thread thr1 = new Thread(myr);
        thr1.start();

        for (int i = 3; i > 0; i--) {
            System.out.println("loop number " + i + ", time: " + myr.getStartTime());
            Thread.sleep(100);
        }

        /*Thread childTread = new Thread(myr);
        childTread.start();

        for (int i = 0; i < 3; i++) {
            System.out.println("m" + i);
            Thread.sleep(1000);
        }

        childTread.join();*/
        System.out.println("End Main.");
    }

}
