
package javaadvanced.viernes.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestIO21 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout= new FileOutputStream("C:\\concierto.txt");
        PrintStream ps= new PrintStream(fout);
        
        ps.println("Bienvenido al Octure Fest");
        /*ps.println("Primer Artista:");
        ps.println("Nombre: John Newman ");
        ps.println("Cancion: Love Me Again");
        ps.println("Generos:Soul, Pop, Breakbeat, Northern soul");*/
        ps.close();
        fout.close();
        System.out.println("Listo");
    }
}
