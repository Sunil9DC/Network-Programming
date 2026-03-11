import java.net.*;
import java.util.*;

public class NetworkInterfaceExample
{
    public static void main(String[] args)
    {
        try
        {
            Enumeration<NetworkInterface> interfaces =
                NetworkInterface.getNetworkInterfaces();

            while(interfaces.hasMoreElements())
            {
                NetworkInterface ni = interfaces.nextElement();

                System.out.println("Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());
                System.out.println("Is Up: " + ni.isUp());
                System.out.println("Is Loopback: " + ni.isLoopback());

                Enumeration<InetAddress> addresses =
                    ni.getInetAddresses();

                while(addresses.hasMoreElements())
                {
                    InetAddress addr = addresses.nextElement();
                    System.out.println("IP Address: " + addr);
                }

                System.out.println("---------------------");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}