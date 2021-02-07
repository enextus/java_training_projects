public class App_dev {

    public static void main(String[] args) {

        MyCharThread myOwnThread0 = new MyCharThread(10, "Аксенов");
        MyCharThread.listOfTarakans.add(myOwnThread0);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes = new Thread(myOwnThread0);
        // start of our thread
        threadRes.start();

        MyCharThread myOwnThread1 = new MyCharThread(10, "Солженицын");
        MyCharThread.listOfTarakans.add(myOwnThread1);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes1 = new Thread(myOwnThread1);
        // start of our thread
        threadRes1.start();

        MyCharThread myOwnThread2 = new MyCharThread(10, "Щаранский");
        MyCharThread.listOfTarakans.add(myOwnThread2);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes2 = new Thread(myOwnThread2);
        // start of our thread
        threadRes2.start();

        MyCharThread myOwnThread3 = new MyCharThread(10, "Аксенов");
        MyCharThread.listOfTarakans.add(myOwnThread3);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes3 = new Thread(myOwnThread3);
        // start of our thread
        threadRes3.start();

        MyCharThread myOwnThread4 = new MyCharThread(10, "Солженицын");
        MyCharThread.listOfTarakans.add(myOwnThread4);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes4 = new Thread(myOwnThread4);
        // start of our thread
        threadRes4.start();

        MyCharThread myOwnThread5 = new MyCharThread(10, "Щаранский");
        MyCharThread.listOfTarakans.add(myOwnThread5);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes5 = new Thread(myOwnThread5);
        // start of our thread
        threadRes5.start();


        MyCharThread myOwnThread6 = new MyCharThread(10, "Брежнев");
        MyCharThread.listOfTarakans.add(myOwnThread6);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes6 = new Thread(myOwnThread6);
        // start of our thread
        threadRes6.start();

        MyCharThread myOwnThread7 = new MyCharThread(10, "Чубайс");
        MyCharThread.listOfTarakans.add(myOwnThread7);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes7 = new Thread(myOwnThread7);
        // start of our thread
        threadRes7.start();

        MyCharThread myOwnThread8 = new MyCharThread(10, "Абрамович");
        MyCharThread.listOfTarakans.add(myOwnThread8);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes8 = new Thread(myOwnThread8);
        // start of our thread
        threadRes8.start();

        MyCharThread myOwnThread9 = new MyCharThread(10, "Березовский");
        MyCharThread.listOfTarakans.add(myOwnThread9);
        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes9 = new Thread(myOwnThread9);
        // start of our thread
        threadRes9.start();
    }

}

// get parameters
/*      System.out.println("threadRes.getName(): " + threadRes.getName());
        System.out.println("threadRes.getId(): " + threadRes.getId());
        System.out.println("threadRes.getState(): " + threadRes.getState());
        System.out.println("threadRes.getPriority(): " + threadRes.getPriority());*/