import java.util.List;

public class App_dev {

    public static void main(String[] args) {

        MyCharThread myOwnThread0 = new MyCharThread(3, "Аксенов");
        MyCharThread.listOfTarakans.add(myOwnThread0);

        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes = new Thread(myOwnThread0);

        // start of our thread
        threadRes.start();

        System.out.println();

        MyCharThread myOwnThread1 = new MyCharThread(3, "Солженицын");
        MyCharThread.listOfTarakans.add(myOwnThread1);

        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes1 = new Thread(myOwnThread1);

        // start of our thread
        threadRes1.start();

        MyCharThread myOwnThread2 = new MyCharThread(3, "Щаранский");
        MyCharThread.listOfTarakans.add(myOwnThread2);

        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes2 = new Thread(myOwnThread2);

        // start of our thread
        threadRes2.start();

        System.out.println("MyCharThread.listOfTarakans.size(): " + MyCharThread.listOfTarakans.size());
    }

}


// get parameters
/*      System.out.println("threadRes.getName(): " + threadRes.getName());
        System.out.println("threadRes.getId(): " + threadRes.getId());
        System.out.println("threadRes.getState(): " + threadRes.getState());
        System.out.println("threadRes.getPriority(): " + threadRes.getPriority());*/