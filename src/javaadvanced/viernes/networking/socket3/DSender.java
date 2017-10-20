
package javaadvanced.viernes.networking.socket3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class DSender {
    public static void main(String[] args) throws SocketException, IOException {
        System.out.println("Cliente");
        DatagramSocket ds= new DatagramSocket();
        
        String str="Hola";
        InetAddress ip=InetAddress.getByName("127.0.0.1");
        DatagramPacket dp= 
                new DatagramPacket(str.getBytes(), str.length(),ip,3000);
        ds.send(dp);
        ds.close();
    }
}
