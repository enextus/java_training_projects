import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    private final static int TCP_PORT = 3000;
    private final static String HOST = "localhost";

    public static void main(String[] args) {

        try (Socket ClientSocket = new Socket(HOST, TCP_PORT)) {

            // we build a PrintWriter with auto-flush
            PrintWriter outWriter = new PrintWriter(ClientSocket.getOutputStream(), true);

            //  we build a character based input stream with buffer
            BufferedReader inReader = new BufferedReader(new InputStreamReader(ClientSocket.getInputStream()));

            // we scan a data from specified input stream
            Scanner scanner = new Scanner(System.in);
            String line = null;

            // the loop for the scanning the input stream from the console
            while (!"exit".equalsIgnoreCase(line)) { // there is another way to realise the if-condition: (line = fromConsole.readLine()) != null && !line.equals("exit")

                line = scanner.nextLine();
                outWriter.println(line);
                // for the case if the auto-flush is false: outWriter.flush();

                System.out.println("Reply from server: " + inReader.readLine());
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
