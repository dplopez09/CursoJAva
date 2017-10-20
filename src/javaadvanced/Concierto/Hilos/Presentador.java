/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Concierto.Hilos;


import javaadvanced.Miercoles.ConciertoAbstracto.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import  java.io.IOException;


public class Presentador extends Acciones{
    public static void main(String[] args) {
        Artista a1= new Artista("John Newman", 
         "Masculino","Soul, Pop, Breakbeat, Northern soul","Guitarra",27);
        Acciones doit=new Presentador();
        doit.Presentacion(a1);
        doit.Canta(a1);
        
        Artista a2= new Artista("losing", 
        "Masculino","Soul, Pop, Breakbeat, Northern soul","Guitarra",27);
        doit.Presentacion(a2);
        doit.Canta(a2);
        
    }

    @Override
    void Presentacion(Artista a) {
        System.out.println("Presentando a:" +a.getNombre());
        String foto= a.getNombre()+".jpg";
        
        JFrame f = new JFrame("Load Image Sample");
            
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        f.add(new LoadImageApp(foto));
        f.pack();
        f.setVisible(true);
    }

    @Override
    void Canta(Artista a) {
        
        String cancion = a.getNombre().trim() + ".wav";
        try{
            /*InputStream in = new FileInputStream(cancion);
            AudioStream as=new AudioStream(in);
         
            AudioPlayer.player.start(as);*/
         
            Clip sonido = AudioSystem.getClip();
            File file = new File(cancion);
            sonido.open(AudioSystem.getAudioInputStream(file));
            sonido.start();
            Thread.sleep(10000); 
            sonido.close();
        }catch(Exception e){
            System.out.println("" + e);
        }
    }
}
