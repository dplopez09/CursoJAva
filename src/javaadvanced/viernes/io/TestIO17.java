
package javaadvanced.viernes.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class TestIO17 {
    public static void main(String[] args) throws IOException{
        FileWriter fr=new FileWriter("C:\\artista.txt");
        BufferedWriter bw= new BufferedWriter(fr);
        bw.write("Prueben el Mov004");
        bw.close();
        System.out.println("Listo");
        
    }
}
