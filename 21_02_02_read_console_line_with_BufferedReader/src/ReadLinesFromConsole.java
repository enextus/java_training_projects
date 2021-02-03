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
