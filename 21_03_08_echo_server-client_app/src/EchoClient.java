import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static int TCP_PORT = 3000;

    public static void main(String[] args) {

        String host = "localhost";

        try (Socket socket = new Socket(host, TCP_PORT)) {

            PrintWriter outWriter = new PrintWriter(socket.getOutputStream(), true); // we build a PrintWriter
            BufferedReader inReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //  we build a PrintWriter

            Scanner scanner = new Scanner(System.in);
            String line = null;

            while (!"exit".equalsIgnoreCase(line)) {

                line = scanner.nextLine();
                outWriter.println(line);
                outWriter.flush();
                System.out.println("Server replied " + inReader.readLine());

            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
