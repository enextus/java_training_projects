public class App_dev {

    public static void main(String[] args) {

        MyCharThread myOwnThread0 = new MyCharThread(10, "Лукашенко");
        Thread threadRes = new Thread(myOwnThread0);
        threadRes.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread1 = new MyCharThread(10, "Солженицын");
        Thread threadRes1 = new Thread(myOwnThread1);
        threadRes1.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread2 = new MyCharThread(10, "Щаранский");
        Thread threadRes2 = new Thread(myOwnThread2);
        threadRes2.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread3 = new MyCharThread(10, "Аксенов");
        Thread threadRes3 = new Thread(myOwnThread3);
        threadRes3.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread4 = new MyCharThread(10, "Столыпин");
        Thread threadRes4 = new Thread(myOwnThread4);
        threadRes4.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread5 = new MyCharThread(10, "Керенский");
        Thread threadRes5 = new Thread(myOwnThread5);
        threadRes5.start();

        // ____________________________________________________________________________________________


        MyCharThread myOwnThread6 = new MyCharThread(10, "Брежнев");
        Thread threadRes6 = new Thread(myOwnThread6);
        threadRes6.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread7 = new MyCharThread(10, "Чубайс");
        Thread threadRes7 = new Thread(myOwnThread7);
        threadRes7.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread8 = new MyCharThread(10, "Абрамович");
        Thread threadRes8 = new Thread(myOwnThread8);
        threadRes8.start();

        // ____________________________________________________________________________________________

        MyCharThread myOwnThread9 = new MyCharThread(10, "Березовский");
        Thread threadRes9 = new Thread(myOwnThread9);
        threadRes9.start();

        System.out.println("\n\n");
    }

}
