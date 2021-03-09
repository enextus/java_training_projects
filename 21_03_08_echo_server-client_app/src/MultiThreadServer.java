import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MultiThreadServer {
    public static void main(String[] args) {

        // initialized with null for the begin of work
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
            PrintWriter outStream = null;
            BufferedReader inStream = null;

            try {

                outStream = new PrintWriter(clientSocket.getOutputStream(), true);
                inStream = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

                String line;

                while ((line = inStream.readLine()) != null) {
                    System.out.printf("Data sent from client: %s\n", line);
                    outStream.println(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                try {
                    if (outStream != null) {
                        outStream.close();
                    }

                    if (inStream != null)
                        inStream.close();

                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}

/*
/home/enextus/.jdks/openjdk-14.0.2/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:54753,suspend=y,server=n -Dfile.encoding=UTF-8 -classpath
/home/enextus/IdeaProjects/java_training_projects/21_03_08_echo_server-client_app/out/production/21_03_08_echo_server-client_app:/snap/intellij-idea-ultimate/269/lib/idea_rt.jar MultiThreadServer
        Connected to the target VM, address: '127.0.0.1:54753', transport: 'socket'
*/
