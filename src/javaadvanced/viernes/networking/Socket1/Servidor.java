
package javaadvanced.viernes.networking.Socket1;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args){
        try{
            ServerSocket ss=new ServerSocket(3000);
            Socket s=ss.accept();
            DataInputStream din= new DataInputStream(s.getInputStream());
            String msg=(String)din.readUTF();
            System.out.println("mensaje:"+msg);
            ss.close();
        }catch(IOException ioe){ioe.printStackTrace();}
    }
}
