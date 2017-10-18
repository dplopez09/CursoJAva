/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Tarea;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Reproductor {
     
    public static void main(String[] args) {
        try{

           Clip sonido = AudioSystem.getClip();
            File a = new File("C:\\sonidos\\AmorEterno.wav");
            System.out.println(a);
            sonido.open(AudioSystem.getAudioInputStream(a));
            //sonido.open(AudioSystem.getAudioInputStream(a);
            sonido.start();
            System.out.println("Reproduciendo 10s. de sonido...");
            Thread.sleep(1000); // 1000 milisegundos (10 segundos)
            sonido.close();
        }catch (Exception tipoerror) {
            System.out.println("" + tipoerror);
        }
    }
}
