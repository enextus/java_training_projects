import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadLinesFromConsole {

    public void read() {
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

}
