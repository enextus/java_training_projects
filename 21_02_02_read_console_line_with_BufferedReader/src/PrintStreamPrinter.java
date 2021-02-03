import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamPrinter {

    private final static byte[] bytes = new byte[5_000_000];




    public void print(boolean flush) throws IOException {

        OutputStream ps = new PrintStream("output.txt");


        for (byte j : bytes) {
            ps.write(j);

            if (flush)
                ps.flush();
        }

        ps.close();
    }

}
