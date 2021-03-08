import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;

        try {

            serverSocket = new ServerSocket(32000);
            serverSocket.setReuseAddress(true);

            // the main thread is just accepting new connections
            while (true) {

                Socket socket = serverSocket.accept();
                System.out.println("New client connected " + socket.getInetAddress().getHostAddress());

                ClientHandler clientSocket = new ClientHandler(socket);

                // The background thread will handle each client separately
                new Thread(clientSocket).start();
            }
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

        private final Socket clientSocket;

        public ClientHandler(Socket socket) {
            this.clientSocket = socket;
        }

        @Override
        public void run() {
            PrintWriter out = null;
            BufferedReader in = null;


        }

    }


}
