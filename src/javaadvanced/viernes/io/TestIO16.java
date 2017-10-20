
package javaadvanced.viernes.io;

import java.io.FileReader;
import java.io.IOException;


public class TestIO16 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("C:\\dos.txt");
        int i;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
        fr.close();
    }
}
