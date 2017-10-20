
package javaadvanced.Concierto.ClaseAnonima;

import Jueves.LoadImageApp;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.swing.JFrame;


public class CargaFotos {
    String foto;
    JFrame f;
     public void Display(String foto){
        this.foto=foto;
        f=new JFrame("Load");
        f.addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent e) {
                 System.exit(0);
             }
        });
        f.add(new LoadImageApp(foto));
        f.pack();
        f.setVisible(true);
    }
}
