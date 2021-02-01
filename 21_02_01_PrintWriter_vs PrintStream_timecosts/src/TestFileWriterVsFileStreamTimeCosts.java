import java.io.*;

public class TestFileWriterVsFileStreamTimeCosts {

    private final static byte[] bytes = new byte[5_000_000];

    static {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (i % 100 + 32);
        }
    }

    static void writer(boolean flush) throws IOException {

        Writer fw = new FileWriter("output.txt");
        long a = System.currentTimeMillis();

        for (byte j : bytes) {
            fw.write(j);

            if (flush)
                fw.flush();
        }

        fw.close();

        System.out.println("FileWriter with" + (flush ? "" : "out") + " flushing: " + (System.currentTimeMillis() - a));
    }

    static void stream(boolean flush) throws IOException {

        OutputStream fos = new FileOutputStream("output.txt");
        long a = System.currentTimeMillis();

        for (byte j : bytes) {
            fos.write(j);

            if (flush)
                fos.flush();
        }

        fos.close();

        System.out.println("FileOutputStream with" + (flush ? "" : "out") + " flushing: " + (System.currentTimeMillis() - a));
    }

    public static void main(String[] args) throws Exception {

        writer(true);
        writer(false);
        System.out.println("\n");
        stream(true);
        stream(false);
    }




/*  So, what's the lesson?
    - all writers are buffered because internally they delegate to StreamEncoder which is itself buffered;
    - FileOutputStream is not buffered;
    - non-buffered writing byte-by-byte is very slow.
    - Good practices demand that you always do buffered writing: either using buffered sinks,
      or maintaining an explicit buffer on your side.
      */

/*  FileWriter with flushing: 18047
    FileWriter without flushing: 439
    FileOutputStream with flushing: 16808
    FileOutputStream without flushing: 18454
    */

}
