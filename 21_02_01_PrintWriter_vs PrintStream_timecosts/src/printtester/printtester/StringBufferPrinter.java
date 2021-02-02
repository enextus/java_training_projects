package printtester.printtester;

import printtester.IPrinter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class StringBufferPrinter implements IPrinter {

    private final static byte[] bytes = new byte[1_000_000];

    static {
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) (i % 100 + 32);
        }
    }

    static long getCurrentTimeMillis() {

        return System.currentTimeMillis();
    }

    @Override
    public void print(String[] arrayToPrint) throws IOException {

        boolean flush = true;

        Writer pw = new PrintWriter("output.txt");
        long beforeTest = getCurrentTimeMillis();

        for (byte j : bytes) {
            pw.write(j);

            if (flush)
                pw.flush();
        }

        pw.close();




/*      StringBuffer buffer = new StringBuffer();
        for (String str : arrayToPrint)
            buffer.append(str);

        buffer.toString(); // anschließende Umwandlung Obj toString*/

    }

}
