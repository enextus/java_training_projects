package printtester.printtester;

import printtester.IPrinter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrintWriterPrinter implements IPrinter {

    private final static byte[] bytes = new byte[5_000_000];
    private final static boolean flush = true;

    static {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (i % 100 + 32);
        }
    }

    static long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override
    public void print(boolean flush) throws IOException {

        Writer pw = new PrintWriter("output.txt");
        long beforeTest = getCurrentTimeMillis();

        for (byte j : bytes) {
            pw.write(j);

            if (flush)
                pw.flush();
        }

        pw.close();
    }

}
