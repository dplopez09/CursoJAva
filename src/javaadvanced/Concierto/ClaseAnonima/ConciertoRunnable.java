
package javaadvanced.Concierto.ClaseAnonima;

import java.io.IOException;
import javaadvanced.Concierto.Hilos.Artista;


public class ConciertoRunnable {
    public static void main(String[] args)throws InterruptedException {
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
    private static void Presenta(String song, String imagen) throws InterruptedException {
       Runnable r1=new Runnable(){
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
        Thread t1=new Thread(r1);
        t1.start();
        t1.sleep(17000);
    }
}
