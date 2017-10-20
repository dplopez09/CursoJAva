
package Jueves.IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO5 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fout= new FileOutputStream("C:\\hola.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        String s="Hola todos";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.flush();
        fout.flush();
        System.out.println("Listo");
    }
}
