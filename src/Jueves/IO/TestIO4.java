
package Jueves.IO;

import java.io.FileInputStream;
import java.io.IOException;


public class TestIO4 {
    public static void main(String[] args) {
        try{
            FileInputStream fin= new FileInputStream("C:\\hola.txt");
            int i=0;
            while((i=fin.read())!=-1){
                System.out.print((char)i);
            }
            fin.close();
        }catch(IOException io){
            io.printStackTrace();;
        }
    }
}
