class MyRunnable implements Runnable {

    Thread thread;
    final String TAG = "testTag ";

    MyRunnable() {
        // second
        thread = new Thread(this, "first thread");
        System.out.println(TAG + "first thread " + thread);
        thread.start(); // start of thread
    }

    @Override
    public void run() {

        System.out.println("Start second thread: ");

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(TAG + "second thread: " + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println(TAG + "second thread was break");
            // break;
        }
    }

}
