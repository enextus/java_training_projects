import java.util.List;

class ListThread extends Thread {
    private static String items[] = {"A", "B", "C", "D"};
    private List<String> list;
    private String name;

    public ListThread(List<String> masterList, String threadName) {
        list = masterList;
        name = threadName;
    }

    public void run() {
        for (int i = 0; i < items.length; ++i) {
            randomWait();
            String data = "Thread [" + name + "][" + items[i] + "]";
            System.out.println(data);
            list.add(data);
        }
    }

    private void randomWait() {
        try {
            Thread.currentThread();
            Thread.sleep((long) (3000 * Math.random()));
        } catch (InterruptedException x) {
        }
    }

}
