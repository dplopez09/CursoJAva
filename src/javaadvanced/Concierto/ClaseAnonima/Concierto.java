/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Concierto.ClaseAnonima;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javaadvanced.Concierto.Hilos.Acciones;
import javaadvanced.Concierto.Hilos.Artista;
import javaadvanced.Concierto.Hilos.Presentador;

/**
 *
 * @author HP
 */

public class Concierto {
    public static void main(String[] args) throws InterruptedException {
        String artista;
        String song;
        
        Artista a1= new Artista("John Newman", 
         "Masculino","Soul, Pop, Breakbeat, Northern soul","Guitarra",27);     
        artista=a1.getNombre();
        song="Love Me Again";
        Presenta(song, artista);
        
        Artista a2= new Artista("Jhon Newman", 
         "Masculino","Tribute_Deluxe","Guitarra",27);     
        artista=a2.getGenero();
        song="Losing Sleep";
        Presenta(song, artista);
        
    }
    private static void Song(String song, String imagen) {
        /*Thread audio=new Thread(){
            public void run(){*/
                Audio a1=new Audio();
                try {
                    a1.PlayMusic(song+".wav");
                } catch (IOException ex) {
                    Logger.getLogger(Concierto.class.getName()).log(Level.SEVERE, null, ex);
                }
            /*
        };*/
        //audio.start();
        /*Thread picture=new Thread(){
            public void run(){*/
                CargaFotos photo= new CargaFotos();
                photo.Display(imagen+".jpg");
            /*}
        };
        picture.start();*/
    }
    private static void Presenta(String song, String imagen) throws InterruptedException {
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
       artista.sleep(17000);
       //audio.interrupt();
    }
}
