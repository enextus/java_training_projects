
public class OneItemStringQueue {

    private final Object mutex = new Object();

    private String source;



    public void addFirst(String item) {

        synchronized (mutex){
            source = item;
            // wake
            mutex.notify();
            System.out.println("This thread id: " + Thread.currentThread().getId());

        }
    }

    public String removeLast() throws InterruptedException {

        synchronized (mutex) {
            while (source == null) {

                System.out.println("This thread id: " + Thread.currentThread().getId());
                //sleep
                mutex.wait();
            }

        }

        String res = source;
        source = null;
        return res;
    }

}
