/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Concierto.ClaseAnonima;
import Jueves.*;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import  java.io.IOException;

public class Audio {
    String song;
    /*public static void main(String[] args) throws IOException{
        PlayMusic("buenosdias.wav");
    }*/
    //private static void PlayMusic(String song)throws IOException{
    public void PlayMusic(String song)throws IOException{
        this.song=song;
        InputStream in = new FileInputStream(song);
        AudioStream as=new AudioStream(in);
         
         AudioPlayer.player.start(as);
    }
}
