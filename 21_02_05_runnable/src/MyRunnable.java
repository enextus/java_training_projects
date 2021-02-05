class MyRunnable implements Runnable {

    Thread thread;
    final String tag = "21-02-05 - ";

    MyRunnable() {
        // second
        thread = new Thread(this, "first thread");
        System.out.println(tag + "first thread " + thread + "\n");
        thread.start(); // start of first thread
    }

    @Override
    public void run() {

        System.out.println("Start 2. thread: ");

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(tag + "thread: " + i);
                Thread.sleep(5);
            }
        } catch (InterruptedException e) {
            System.out.println("e: " + e + "\n");
            System.out.println(tag + "thread was broken");
            // break;
        }
    }

}
