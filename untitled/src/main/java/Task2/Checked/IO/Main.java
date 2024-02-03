package Task2.Checked.IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) {
        String hostName = "spacelab.ua.com";
        //www.youtube.com

        try {
            InetAddress address = InetAddress.getByName(hostName);
            System.out.println("Host IP address: " + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Unknown host: " + e.getMessage());
        }

        System.out.println("Finish!");
    }
}
