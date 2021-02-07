public class App_dev {

    public static void main(String[] args) {

        // __________________________________________________________________

        MyCharThread myOwnThread = new MyCharThread(1, '#');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes = new Thread(myOwnThread);

        // start of our thread
        threadRes.start();

        // __________________________________________________________________

        MyCharThread hath1 = new MyCharThread(1, '*');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes1 = new Thread(hath1);

        // start of our thread
        threadRes1.start();

        // __________________________________________________________________

        MyCharThread hath2 = new MyCharThread(1, '%');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes2 = new Thread(hath2);

        // start of our thread
        threadRes2.start();

/*        // __________________________________________________________________

        MyCharThread hath3 = new MyCharThread(1, '~');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes3 = new Thread(hath3);

        // start of our thread
        threadRes3.start();*/
    }

}
