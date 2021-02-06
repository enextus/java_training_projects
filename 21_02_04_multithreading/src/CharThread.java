public class CharThread extends Thread {

    final int times;
    final int commonNumber;
    final char ch;

    public CharThread(int times, char ch) {
        this.times = times;
        this.ch = ch;
        this.commonNumber = makeCommonNumber();
    }

    public int getCommonNumber() {
        return commonNumber;
    }

    int makeCommonNumber() {
        int temp = this.getCommonNumber();
        temp += 1;

        return temp;
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
