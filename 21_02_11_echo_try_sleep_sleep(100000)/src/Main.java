import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here

        Echo echo = new Echo("Hello!");

        System.out.println(echo);

        Thread echoTh = new Thread(echo);
        echoTh.start();


        try (BufferedReader br = new BufferedReader((new InputStreamReader(System.in)))) {

            String line;

            while ((line = br.readLine()) != null && !line.equals("exit")) {

                echo.setMessage(line);
                echoTh.interrupt();
            }

        }
    }

}
