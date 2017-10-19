
package Jueves;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class LoadImagen extends Thread{
    String imagen;
    JFrame f;
    public void run(){
        try{
            display("John Newman.jpg");
            System.out.println("Muestra Imagen");
            Thread.sleep(1000);
            f.setVisible(false);
            display("Tribute_Deluxe.jpg");
            System.out.println("Muestra Imagen");
            Thread.sleep(1000);
            f.setVisible(false);
            display("losing.jpg");
            System.out.println("Muestra Imagen");
            Thread.sleep(1000);
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
    public static void main(String[] args) {
        LoadImagen t1= new LoadImagen();
        t1.start();
    }
}
