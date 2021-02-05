
class MyRunnable implements Runnable {

    Thread thread;
    final String TAG = "testTag ";

    MyRunnable() {
        // second
        thread = new Thread(this, "test thread");
        System.out.println(TAG + "first thread " + thread);
        thread.start(); // start of thread
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {


                System.out.println(TAG + "second thread: " + i);

                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(TAG + "second thread was break");
        }
    }

}
