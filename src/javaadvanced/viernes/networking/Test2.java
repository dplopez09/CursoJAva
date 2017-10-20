
package javaadvanced.viernes.networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;


public class Test2 {
    public static void main(String[] args) {
        try{
            URL url=new URL("https://bancoppel.com/");
            URLConnection urlcon= url.openConnection();
            InputStream stream=  urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1)
            {
                System.out.print((char)i);
            }
        }catch(IOException ioe){ioe.printStackTrace();}
    }
}
