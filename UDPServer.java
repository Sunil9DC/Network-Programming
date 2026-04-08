// UDPServer.java
import java.net.*;

public class UDPServer {
    public static void main(String[] args) throws Exception {

        // Create DatagramSocket at port 9876
        DatagramSocket serverSocket = new DatagramSocket(9876);
        System.out.println("Server is waiting for message...");

        // Create buffer to receive data
        byte[] receiveData = new byte[1024];

        // Create DatagramPacket to receive data
        DatagramPacket receivePacket =
                new DatagramPacket(receiveData, receiveData.length);

        // Receive data
        serverSocket.receive(receivePacket);

        // Convert bytes into String
        String message = new String(receivePacket.getData(), 0,
                                     receivePacket.getLength());

        System.out.println("Message received from client: " + message);

        serverSocket.close();
    }
}