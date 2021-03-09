import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;

        try {

            // we create the server socket here
            serverSocket = new ServerSocket(3000);

            // 2× MSL (30/120s) turned on. SO_REUSEADDR allows your server to bind to an address that is in TIME_WAIT state.
            serverSocket.setReuseAddress(true);

            // loop there the main thread is just accepting new connections
            while (true) {

                try {

                    // we listening and accept here new connection for the creating a new socket
                    Socket socket = serverSocket.accept();
                    System.out.println("New client connected: " + socket.getInetAddress().getHostAddress());

                    ClientHandler clientSocket = new ClientHandler(socket);

                    // The background thread will handle each client separately
                    new Thread(clientSocket).start();
                    
                } catch (IOException e) {
                    System.err.println("Accept this connection failed");

                    // terminates currently running JVM
                    System.exit(1);
                }


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

            try {
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String line;

                while ((line = in.readLine()) != null) {
                    System.out.printf("Data sent from client: %s\n", line);
                    out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (out != null) {
                        out.close();
                    }

                    if (in != null)
                        in.close();

                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
