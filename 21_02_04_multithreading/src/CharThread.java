
public class CharThread extends Thread {

    public static class instanceCounter {

        final int commonNumber;

        public instanceCounter(int commonNumber) {
            this.commonNumber = commonNumber;
        }

        public int getCommonNumber() {
            return commonNumber;
        }

        public int makeCommonNumber() {
            int temp = this.getCommonNumber();
            temp += 1;

            return temp;
        }
    }

    final int times;
    final char ch;
    final int commonNumber;

    public CharThread(int times, char ch) {
        this.times = times;
        this.ch = ch;
        this.commonNumber = instanceCounter.makeCommonNumber();
    }

    @Override
    public void run() {

        // Here is the logic of not-main thread
        System.out.println("Start CharThread");
        for (int i = 0; i < times; i++) {
            System.out.println(ch);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
