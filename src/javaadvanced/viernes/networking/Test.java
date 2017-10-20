
package javaadvanced.viernes.networking;

import java.io.IOException;
import java.net.URL;

/*
IP:Es una dirección logica que uede ser cambiada
Esta compuesta por objetos en un rango de 0 a 255
Protocolo:Un conjunto de reglas asignadas a un nodo de un canal de 
comunicación: TCP, FTP, Telnet, SMTP, POP

Numero de puerto:Es usado para identificar diferentes aplicaciones.
EndPoint, esta asociado a la direccion IP

MAC:(Media Acces Control), direccion con identificador unico 
NIC(NetWorking Interface Controler).
Un canal puede tener multiples NIC pero cada uno tiene una unica MAC.
Connection-Oriented:TCP
Connection-less:UDP
Socket:Es un endpoint entre 2 vias de comunicación.
Un socket es usado para la comunicación entre aplicaciones que 
poseen diferentes JRE.

Java Sockets pueden ser usados para connection oriented y oriented less.

connection-Oriented:Socket y ServeSocket
connection-less:DatagramSocket y DatagramPacket

en el cliente un socket debe de tener dos datos.
1.-Ip del servidor
2.-Puerto
*/
public class Test {
    public static void main(String[] args) {
        try{
            URL url=new URL("http://www.coppel.com");
            System.out.println("Protocolo: " +url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Puerto: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        }catch(IOException ioe){ioe.printStackTrace();}
    }
}
