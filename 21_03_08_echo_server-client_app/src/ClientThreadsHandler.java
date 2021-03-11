import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientThreadsHandler implements Runnable {

    private final Socket clientSocket;

    public ClientThreadsHandler(Socket socket) {
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
                outStream.println(" here " + line);

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