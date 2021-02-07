public class App_dev {

    public static void main(String[] args) {

        // Аксенов, Солженицын, Щаранский

        // __________________________________________________________________

        MyCharThread myOwnThread0 = new MyCharThread(3, "Аксенов");
        MyCharThread.listOfTarakans.add(myOwnThread0);

        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes = new Thread(myOwnThread0);

        // start of our thread
        threadRes.start();

        // get parameters
/*        System.out.println("threadRes.getName(): " + threadRes.getName());
        System.out.println("threadRes.getId(): " + threadRes.getId());
        System.out.println("threadRes.getState(): " + threadRes.getState());
        System.out.println("threadRes.getPriority(): " + threadRes.getPriority());*/
        System.out.println();

        // __________________________________________________________________

        MyCharThread myOwnThread1 = new MyCharThread(3, "Солженицын");
        MyCharThread.listOfTarakans.add(myOwnThread0);

        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes1 = new Thread(myOwnThread1);

        // start of our thread
        threadRes1.start();

        // get parameters
/*        System.out.println("threadRes1.getName(): " + threadRes1.getName());
        System.out.println("threadRes1.getId(): " + threadRes1.getId());
        System.out.println("threadRes1.getState(): " + threadRes1.getState());
        System.out.println("threadRes1.getPriority(): " + threadRes1.getPriority());*/
        System.out.println();

        // __________________________________________________________________

        MyCharThread myOwnThread2 = new MyCharThread(3, "Щаранский");
        MyCharThread.listOfTarakans.add(myOwnThread0);

        // realise Thread with JAVA implementation and our MyCharThread class
        Thread threadRes2 = new Thread(myOwnThread2);

        // start of our thread
        threadRes2.start();

        // get parameters
/*        System.out.println("threadRes2.getName(): " + threadRes2.getName());
        System.out.println("threadRes2.getId(): " + threadRes2.getId());
        System.out.println("threadRes2.getState(): " + threadRes2.getState());
        System.out.println("threadRes2.getPriority(): " + threadRes2.getPriority());*/
        System.out.println();

        //

    }

}
