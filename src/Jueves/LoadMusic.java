
package Jueves;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import  java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class LoadMusic extends Thread{
    String imagen, song;
    JFrame f;
    public void run(){   
       try{
            display("John Newman.jpg");
            System.out.println("Muestra Imagen");
            Thread.sleep(5000);
            f.setVisible(false);
            display("losing.jpg");
            System.out.println("Muestra Imagen");
            Thread.sleep(5000);
            f.setVisible(false);
            display("John Newman.jpg");
            System.out.println("Muestra Imagen");
            Thread.sleep(5000);
        }catch(InterruptedException ie){
            System.out.println(ie);
        }
    }
    public void display(String imagen){
    //public static void display(String imagen){
        this.imagen=imagen;
        //String imagen="jhon.jpg";
        f=new JFrame("Load");
        //JFrame f=new JFrame("Load");
         f.addWindowListener(new WindowAdapter(){
         public void windowClosing(WindowEvent e) {
                  System.exit(0);
              }
         });
         f.add(new LoadImageApp(imagen));
         f.pack();
         f.setVisible(true);
    }
    /*public void Music(String song)throws IOException{
        this.song=song;
           InputStream in = new FileInputStream(song);
           AudioStream as=new AudioStream(in);
           
           AudioPlayer.player.start(as);
    }*/
    public static void main(String[] args)throws IOException {
        LoadMusic t1= new LoadMusic();
        t1.start();
        Hola t=new Hola();
        t.PlayMusic("losing.wav");
        //t.PlayMusic("John Newman.wav");
    }
}
