class MyRunnable implements Runnable {

    Thread thread;
    final String TAG = "Some TAG here - ";

    MyRunnable() {
        // second
        thread = new Thread(this, "first thread");
        System.out.println(TAG + "first thread " + thread + "\n");
        thread.start(); // start of first thread
    }

    @Override
    public void run() {

        System.out.println("Start second thread: ");

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(TAG + "thread: " + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("e: " + e + "\n");
            System.out.println(TAG + "thread was broken");
            // break;
        }
    }

}
