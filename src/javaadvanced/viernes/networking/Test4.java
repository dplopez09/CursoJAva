
package javaadvanced.viernes.networking;

import java.net.InetAddress;

public class Test4 {
    public static void main(String[] args) {
        try{
            InetAddress ip=
                    InetAddress.getByName("www.coppel.com");
            System.out.println("Nombre del Host: "+ip.getHostName());
            System.out.println("Direccion Ip: "+ip.getHostAddress());
        }catch (Exception e){e.printStackTrace();}
    }
}
