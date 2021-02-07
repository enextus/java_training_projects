public class App_dev {

    public static void main(String[] args) {

        // __________________________________________________________________

        MyCharThread myOwnThread = new MyCharThread(1, '#');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes = new Thread(myOwnThread);

        // start of our thread
        threadRes.start();

        // get parameters
        System.out.println("threadRes.getName(): " + threadRes.getName());
        System.out.println("threadRes.getId(): " + threadRes.getId());
        System.out.println("threadRes.getState(): " + threadRes.getState());
        System.out.println("threadRes.getPriority(): " + threadRes.getPriority());
        System.out.println();

        // __________________________________________________________________

        MyCharThread hath1 = new MyCharThread(1, '*');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes1 = new Thread(hath1);

        // start of our thread
        threadRes1.start();

        // get parameters
        System.out.println("threadRes1.getName(): " + threadRes1.getName());
        System.out.println("threadRes1.getId(): " + threadRes1.getId());
        System.out.println("threadRes1.getState(): " + threadRes1.getState());
        System.out.println("threadRes1.getPriority(): " + threadRes1.getPriority());
        System.out.println();

        // __________________________________________________________________

        MyCharThread hath2 = new MyCharThread(1, '%');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes2 = new Thread(hath2);

        // start of our thread
        threadRes2.start();

        // get parameters
        System.out.println("threadRes1.getName(): " + threadRes1.getName());
        System.out.println("threadRes1.getId(): " + threadRes1.getId());
        System.out.println("threadRes1.getState(): " + threadRes1.getState());
        System.out.println("threadRes1.getPriority(): " + threadRes1.getPriority());
        System.out.println();

/*      // __________________________________________________________________

        MyCharThread hath3 = new MyCharThread(1, '~');
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes3 = new Thread(hath3);

        // start of our thread
        threadRes3.start();*/
    }

}
