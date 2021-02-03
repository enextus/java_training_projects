import java.io.*;
import java.util.Arrays;

public class ReadLinesFromConsole {

    String[] arrWords;
    boolean flush = true;

    public void readAndWrite() {
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

        for (String elm : arrWords) {
            pw.write(elm);
        }

        if (flush)
            pw.flush();

        pw.close();

        System.out.println("Input text was written in to the file with" + (flush ? "" : "out") + " flushing. ");
    }

}
