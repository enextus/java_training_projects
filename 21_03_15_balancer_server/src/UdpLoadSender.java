
import java.io.IOException;
import java.net.*;
import java.util.concurrent.atomic.AtomicInteger;

public class UdpLoadSender implements Runnable {

    private final String balancerHost;
    private final int udpBalancerPort;
    private final AtomicInteger connectionCounter;
    private final int sendInterval;
    private final int selfTcpPort;

    public UdpLoadSender(String balancerHost, int udpBalancerPort, AtomicInteger connectionCounter, int sendInterval, int selfTcpPort) {
        this.balancerHost = balancerHost;
        this.udpBalancerPort = udpBalancerPort;
        this.connectionCounter = connectionCounter;
        this.sendInterval = sendInterval;
        this.selfTcpPort = selfTcpPort;
    }

    @Override
    public void run() {
        // where to to send the datagrams
        try {
            InetAddress inetAddress = InetAddress.getByName(balancerHost);
            DatagramSocket udpSocket = new DatagramSocket();

            while (true) {
                String data = selfTcpPort + ":" + connectionCounter.toString();
                System.out.println(data);
                byte[] outputData = data.getBytes();
                // datagram to send
                DatagramPacket packetOut = new DatagramPacket(
                        outputData,
                        outputData.length,
                        inetAddress,
                        udpBalancerPort);
                // sending the datagram
                udpSocket.send(packetOut);


                Thread.sleep(sendInterval);
            }

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

    }
}