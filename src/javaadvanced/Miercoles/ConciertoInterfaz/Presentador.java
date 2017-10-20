/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.ConciertoInterfaz;


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
import java.util.logging.Level;
import java.util.logging.Logger;
import javaadvanced.Concierto.ClaseAnonima.Audio;
import javaadvanced.Concierto.ClaseAnonima.CargaFotos;

class Concierto implements Acciones{

    @Override
    public void Presenta(String song, String imagen) {
        Thread artista=new Thread(){
            public void run(){
                Audio a1=new Audio();
                try {
                    a1.PlayMusic(song+".wav");
                    CargaFotos photo= new CargaFotos();
                    photo.Display(imagen+".jpg");
                    System.out.println("Cantante: "+imagen);
                    System.out.println("Cancion: "+song);
                } catch (IOException ex) {
                    //
                }
                /*CargaFotos photo= new CargaFotos();
                photo.Display(imagen+".jpg");*/
            };
        
         };
       artista.start();
        try {
            artista.sleep(17000);
            //audio.interrupt();
        } catch (InterruptedException ex) {
            Logger.getLogger(Concierto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
public class Presentador {
    public static void main(String[] args) {
        String artista;
        String song;
        
        Artista a1= new Artista("John Newman", 
         "Masculino","Soul, Pop, Breakbeat, Northern soul","Guitarra",27);     
        artista=a1.getNombre();
        song="Love Me Again";
        Concierto conci= new Concierto();
        conci.Presenta(song, artista);
     }
}
