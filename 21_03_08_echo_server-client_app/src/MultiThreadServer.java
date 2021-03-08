import java.io.IOException;
import java.net.ServerSocket;

public class MultiThreadServer {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;

        try {

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ClientHandler implements Runnable {

    }


}
