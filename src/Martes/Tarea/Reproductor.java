
package Martes.Tarea;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import  java.io.IOException;


public class Reproductor {
     
    public static void main(String[] args) throws IOException{

           //String song="AmorEterno.wav";
           String song="cancion2.wav";
           
           InputStream in = new FileInputStream("buenosdias.wav");
           AudioStream as=new AudioStream(in);
           
           AudioPlayer.player.start(as);
 
  
    }
}
        

/*try{
String cad = new String("C:\\sonidos\\AmorEterno.wav");
ProcessBuilder p=new ProcessBuilder("cmd.exe","/c","start",cad);
p.start();
}catch(Exception e) {}*/

