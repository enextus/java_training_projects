package printtester.printtester;

import printtester.IPrinter;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamPrinter implements IPrinter {

    private final static byte[] bytes = new byte[1_000_000];
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

        OutputStream ps = new PrintStream("output.txt");
        long beforeTest = getCurrentTimeMillis();

        for (byte j : bytes) {
            ps.write(j);

            if (flush)
                ps.flush();
        }

        ps.close();

    }

}
