import java.io.*;

public class TestPrintWriterVsPrintStreamTimeCosts {

    private final static byte[] bytes = new byte[1_000_000];

    static {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (i % 100 + 32);
        }
    }

    static long getCurrentTimeMillis() {

        return System.currentTimeMillis();
    }

    static void printWriter(boolean flush) throws IOException {

        Writer pw = new PrintWriter("output.txt");
        long startTime = getCurrentTimeMillis();

        for (byte j : bytes) {
            pw.write(j);

            if (flush)
                pw.flush();
        }

        pw.close();

        System.out.println("PrintWriter with" + (flush ? "" : "out") + " flushing: " + (getCurrentTimeMillis() - startTime));
    }

    static void printStream(boolean flush) throws IOException {

        OutputStream ps = new PrintStream("output.txt");
        long startTime = getCurrentTimeMillis();

        for (byte j : bytes) {
            ps.write(j);

            if (flush)
                ps.flush();
        }

        ps.close();

        System.out.println("PrintStream with" + (flush ? "" : "out") + " flushing: " + (getCurrentTimeMillis() - startTime));
    }

    public static void main(String[] args) throws Exception {

        printWriter(true);
        printWriter(false);

        System.out.println(" ");

        printStream(true);
        printStream(false);
    }

/*      PrintWriter with flushing: 2189
        PrintWriter without flushing: 36

        PrintStream with flushing: 1627
        PrintStream without flushing: 1591

    - All writers are buffered because internally they delegate to StreamEncoder which is itself buffered;
    - PrintStream is not buffered;
    - Non-buffered writing byte-by-byte is very slow;
    - Good practices demand always do buffered writing:
        either using buffered sinks,
        or maintaining an explicit buffer on our side;
*/

}
