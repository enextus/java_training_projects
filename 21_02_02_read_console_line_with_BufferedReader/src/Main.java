import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
    // Read multi-line input using BufferedReader class
    public static void main(String[] args) {
        try (BufferedReader inBuffer = new BufferedReader(new InputStreamReader(System.in))) {

            String line;

            while ((line = inBuffer.readLine()) != null || !line.equals("exit")) {

                String[] tokens = line.split("\\s");

                System.out.println(Arrays.toString(tokens));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
