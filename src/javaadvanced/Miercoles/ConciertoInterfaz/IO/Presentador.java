/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.ConciertoInterfaz.IO;


import javaadvanced.Miercoles.ConciertoInterfaz.*;
import javaadvanced.Miercoles.ConciertoAbstracto.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
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
//Archivos
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

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
            artista.sleep(16500);
            //audio.interrupt();
        } catch (InterruptedException ex) {
            Logger.getLogger(Concierto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
}
class Archivando implements Archivos{

    @Override
    public void Leer(String archivo){
        try (FileReader fr = new FileReader(archivo)) {
            int i;
            while((i=fr.read())!=-1){
                System.out.print((char)i);
            }
            fr.close();
        }catch(IOException io){io.printStackTrace();}
    }

    @Override
    public void Escribir(String archivolec, String arvicoesc) {
        try{
           FileReader fr=new FileReader(archivolec);
           FileWriter fw= new FileWriter(arvicoesc);
            int i;
            while((i=fr.read())!=-1){
                fw.write((char)i);
                //System.out.print((char)i);
            }
            fr.close();
            fw.close();
        }catch(IOException io){io.printStackTrace();}
    }
    
}
public class Presentador {
    public static void main(String[] args) throws InterruptedException {
        String artista;
        String song;
        
        Artista a1= new Artista("John Newman", 
         "Masculino","Soul, Pop, Breakbeat, Northern soul","Guitarra",27);     
        artista=a1.getNombre();
        song="Love Me Again";
        Concierto conci= new Concierto();
        conci.Presenta(song, artista);
        
        Artista a2= new Artista("Jhon Newman", 
         "Masculino","Tribute_Deluxe","Guitarra",27);     
        artista=a2.getGenero();
        song="Losing Sleep";
        conci.Presenta(song, artista);
        
        
        Thread t1=new Thread(){
            public void run(){
                Archivando archi= new Archivando();
                archi.Leer("C:\\artista.txt");
            }
        };
        Thread t2=new Thread(){
            public void run(){
                Archivando archi= new Archivando();
                archi.Escribir("C:\\artista.txt", "C:\\Concierto.txt");
            }
        };
        
        t1.start();
        //t1.sleep(500);
        t2.start();
        t2.interrupt();
        t1.interrupt();
        //t2.join();
     }
}
