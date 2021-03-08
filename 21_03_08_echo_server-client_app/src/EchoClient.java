import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

    public static void main(String[] args) {

        String host = "127.0.0.1";
        int port = 32000;

        try (Socket socket = new Socket(host, port)) {

            PrintWriter outWriter = new PrintWriter(socket.getOutputStream(), true); // we build a PrintWriter
            BufferedReader inReader = new BufferedReader(new InputStreamReader(socket.getInputStream())); //  we build a PrintWriter

            Scanner scanner = new Scanner(System.in);

            String line = null;


            //


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
