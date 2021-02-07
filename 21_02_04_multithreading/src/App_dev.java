public class App_dev {

    public static void main(String[] args) {

        CharThread hath = new CharThread(1, '#');
        Thread th = new Thread(hath);
        th.start();
        // __________________________________________________________________

        CharThread hath1 = new CharThread(1, '*');
        Thread th1 = new Thread(hath1);
        th1.start();
        // __________________________________________________________________

        CharThread hath2 = new CharThread(1, '%');
        Thread th2 = new Thread(hath2);
        th2.start();
        // __________________________________________________________________

        CharThread hath3 = new CharThread(1, '~');
        Thread th3 = new Thread(hath3);
        th3.start();
        // __________________________________________________________________


    }

}
