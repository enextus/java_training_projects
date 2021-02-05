import java.util.Date;

class MyRunnable implements Runnable {

    public MyRunnable(long startTime) {
        long startTime1 = getStartTime();
    }

    public long getStartTime() {
        return new Date().getTime();
    }

    @Override
    public void run() {

        System.out.println("Start thread.");

        String tag = "21-02-05 / ";
        try {

            for (int i = 3; i > 0; i--) {
                System.out.println(tag + "loop number " + i + ", time: " + getStartTime());
                Thread.sleep(500);
            }

            System.out.println("End thread.");

        } catch (InterruptedException e) {
            System.out.println("e: " + e + "\n");
            System.out.println(tag + "thread was broken");
        }
    }

}
