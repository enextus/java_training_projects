import java.io.*;
import java.util.Arrays;

public class ReadLinesFromConsole {

    public void readWrite() {
        try (BufferedReader inBuffer = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while ((line = inBuffer.readLine()) != null && !line.equals("exit")) {
                String[] arrWords = line.split("\\s");
                System.out.println("Your input was: " + Arrays.toString(arrWords));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Bye!");
    }

    private final static byte[] bytes = new byte[5_000_000];



    static void printWriter(boolean flush) throws IOException {

        Writer pw = new PrintWriter("output.txt");

        for (byte j : bytes) {
            pw.write(j);

            if (flush)
                pw.flush();
        }

        pw.close();

        System.out.println("PrintWriter with" + (flush ? "" : "out") + " flushing: ");
    }


}
