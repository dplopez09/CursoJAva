/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Tarea;

import java.io.*;
import sun.audio.*;


public class Reproductor {
     
    public static void main(String[] args) {
       try
       {
           //String song="AmorEterno.wav";
           String song="C:\\sonidos\\AmorEterno.wav";
           System.out.println(song);
           InputStream in = new FileInputStream(song);
           System.out.println("dos");
           AudioStream audios=new AudioStream(in);
           System.out.println("3");
           AudioPlayer.player.start(audios);
           System.out.println(audios);
       }catch (Exception e){};
  
    }
}
        

/*try{
String cad = new String("C:\\sonidos\\AmorEterno.wav");
ProcessBuilder p=new ProcessBuilder("cmd.exe","/c","start",cad);
p.start();
}catch(Exception e) {}*/

