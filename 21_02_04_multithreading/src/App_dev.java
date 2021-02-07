public class App_dev {

    public static void main(String[] args) {

        MyCharThread hath = new MyCharThread(1, '#');
        Thread th = new Thread(hath);
        th.start();

        // __________________________________________________________________
        MyCharThread hath1 = new MyCharThread(1, '*');
        Thread th1 = new Thread(hath1);
        th1.start();

        // __________________________________________________________________
        MyCharThread hath2 = new MyCharThread(1, '%');
        Thread th2 = new Thread(hath2);
        th2.start();

        // __________________________________________________________________
        MyCharThread hath3 = new MyCharThread(1, '~');
        Thread th3 = new Thread(hath3);
        th3.start();
    }

}
