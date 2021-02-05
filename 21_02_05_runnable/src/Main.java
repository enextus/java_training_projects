public class Main {
    public static void main(String[] args) {

        MyRunnable myr = new MyRunnable();

        Thread thr1 = new Thread(myr);
        Thread thr2 = new Thread(myr);

        thr1.start();
        thr2.start();

    }
}
