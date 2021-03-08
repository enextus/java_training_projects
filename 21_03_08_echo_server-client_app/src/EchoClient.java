import java.io.IOException;
import java.net.Socket;

public class EchoClient {

    public static void main(String[] args) {

        String host = "127.0.0.1";
        int port = 32000;

        try (Socket socket = new Socket(host, port)) {

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
