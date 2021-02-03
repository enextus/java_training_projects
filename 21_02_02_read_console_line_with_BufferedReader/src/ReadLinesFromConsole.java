import java.io.*;
import java.util.Arrays;

public class ReadLinesFromConsole {

    String[] arrWords;
    boolean flush = true;

    public void readWrite() {
        try (BufferedReader inBuffer = new BufferedReader(new InputStreamReader(System.in))) {
            String line;

            while ((line = inBuffer.readLine()) != null && !line.equals("exit")) {
                arrWords = line.split("\\s");
                System.out.println("Your input was: " + Arrays.toString(arrWords));
            }

            printWriter(arrWords, flush);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Bye!");

    }

    static void printWriter(String[] arrWords, boolean flush) throws IOException {

        Writer pw = new PrintWriter("output.txt");


        pw.write(String.valueOf(arrWords));

        if (flush)
            pw.flush();

        pw.close();

        System.out.println("PrintWriter with" + (flush ? "" : "out") + " flushing. ");
    }

}
