// UDPClient.java
import java.net.*;

public class UDPClient {
    public static void main(String[] args) throws Exception {

        // Create DatagramSocket
        DatagramSocket clientSocket = new DatagramSocket();

        // Convert message into bytes
        String message = "Hello Server!";
        byte[] sendData = message.getBytes();

        // Get IP Address of server
        InetAddress IPAddress = InetAddress.getByName("localhost");

        // Create DatagramPacket to send data
        DatagramPacket sendPacket =
                new DatagramPacket(sendData, sendData.length,
                                   IPAddress, 9876);

        // Send packet
        clientSocket.send(sendPacket);

        System.out.println("Message sent to server.");

        clientSocket.close();
    }
}