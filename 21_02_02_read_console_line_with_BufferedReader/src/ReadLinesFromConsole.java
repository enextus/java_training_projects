import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLinesFromConsole {

    String[] arrWords;
    List<String[]> lstStr;

    public List<String[]> readAndWrite() {
        try (BufferedReader inBuffer = new BufferedReader(new InputStreamReader(System.in))) {

            lstStr = new ArrayList<>();
            String line;

            while ((line = inBuffer.readLine()) != null && !line.equals("exit")) {
                arrWords = line.split("\\s");
                System.out.println("Your input was: " + Arrays.toString(arrWords));
                lstStr.add(arrWords);
            }

            // printWriter(lstStr, flush);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println("Bye!");
        return lstStr;
    }

    static void printWriter(List<String[]> lstStr) throws IOException {

        Writer pw = new PrintWriter("output.txt");

        for (String[] elm : lstStr) {

            pw.write(Arrays.toString(elm) + " ");
            pw.write("\n");
        }

        pw.close();

        System.out.println("Input text was written in to the file with");
    }

}

/*
    String[] greeting = {"Hey", "there", "amigo!"};
    String delimiter = " ";
    String.join(delimiter, greeting)
    The output will be "Hey there amigo!".*/
