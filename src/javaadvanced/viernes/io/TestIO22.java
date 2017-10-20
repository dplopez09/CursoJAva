
package javaadvanced.viernes.io;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class TestIO22 {
    public static void main(String[] args) throws IOException{
        //Aqui funciona el Writer como System Out Print
        PrintWriter pw= new PrintWriter(System.out);
        pw.write("Hola con todas las letras");
        pw.flush();
        pw.close();
        
        //Aqui funciona el writer para escribir un achivo
        PrintWriter pw2=  null;
        pw2=new PrintWriter(new File("C:\\uno.txt"));
        pw2.write("Escribiendo un archivo");
        pw2.flush();
        pw2.close();
    }
}
