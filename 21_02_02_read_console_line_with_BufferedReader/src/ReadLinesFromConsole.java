import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLinesFromConsole {

    String[] arrWords;
    boolean flush = true;

    public void readAndWrite() {
        try (BufferedReader inBuffer = new BufferedReader(new InputStreamReader(System.in))) {

            List<String[]> lstStr = new ArrayList<>();

            String line;

            while ((line = inBuffer.readLine()) != null && !line.equals("exit")) {
                arrWords = line.split("\\s");
                System.out.println("Your input was: " + Arrays.toString(arrWords));
                lstStr.add(arrWords);
            }

            printWriter(lstStr, flush);

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Bye!");
    }

    static void printWriter(List<String[]> lstStr, boolean flush) throws IOException {

        Writer pw = new PrintWriter("output.txt");

        for (String[] elm : lstStr) {
            pw.write(elm.toString() + " ");
        }

        if (flush)
            pw.flush();

        pw.close();

        System.out.println("Input text was written in to the file with" + (flush ? "" : "out") + " flushing. ");
    }

}
