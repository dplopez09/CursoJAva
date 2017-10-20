
package javaadvanced.viernes.networking.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
    public static void main(String[] args) throws IOException{
        String msg="", msg2="";
        BufferedReader br=null;
        
        ServerSocket ss= new ServerSocket(3000);
        Socket s= ss.accept();
        
        DataInputStream din=new DataInputStream(s.getInputStream());
        DataOutputStream dot=new DataOutputStream(s.getOutputStream());
        br=new BufferedReader(new InputStreamReader(System.in));
        
        while(!msg.equals("stop"))
        {
            msg=din.readUTF();
            System.out.println("El cliente dice: "+msg);
            msg2=br.readLine();
            dot.writeUTF(msg2);
            dot.flush();
            
        }
        closeStreams(din, dot, s, ss);
    }

    private static void closeStreams(DataInputStream din, DataOutputStream dot, Socket s, ServerSocket ss) throws IOException {
        din.close();
        dot.close();
        s.close();
        ss.close();
    }
}
