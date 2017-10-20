
package Jueves.IO;

import java.io.FileOutputStream;
import java.io.IOException;


public class TestIO2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("C:\\hola.txt");
            String s="Hola mundo Archivos";
            byte b[]=s.getBytes();
            System.out.println("Listo");
            fout.write(b);
            fout.close();
        }catch (IOException io ){
            io.printStackTrace();
        }
    }
}
