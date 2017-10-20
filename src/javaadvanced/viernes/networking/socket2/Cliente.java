
package javaadvanced.viernes.networking.socket2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;


public class Cliente {
    public static void main(String[] args) throws IOException{
        Socket s= new Socket("localhost",3000);
        String msg="", msg2="";
        BufferedReader br=null;
        
        DataInputStream din= new DataInputStream(s.getInputStream());
        DataOutputStream dot=new DataOutputStream(s.getOutputStream());
        br=new BufferedReader(new InputStreamReader(System.in));
         
        while(!msg.equals("stop"))
        {
            msg=br.readLine();
            dot.writeUTF(msg);
            dot.flush();
            
            msg2=din.readUTF();
           
            System.out.println("El servidor dice: "+msg2); 
        }
        dot.close();
        s.close();
        din.close();
    }
}
