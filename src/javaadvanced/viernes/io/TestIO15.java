
package javaadvanced.viernes.io;

import java.io.FileWriter;
import java.io.IOException;
//En Este caso no es necesario pasar a bytes el string.
public class TestIO15 {
    public static void main(String[] args) throws IOException{
        FileWriter fw= new FileWriter("C:\\dos.txt");
        fw.write("Hola Java");
        fw.close();
        System.out.println("Listo");
    }
}
