
package Jueves.IO;
import java.io.Console;
import java.io.IOException;
//SOLO FUNCIONA POR CONSOLA
public class TestIO12 {
    public static void main(String[] args) throws IOException{
        Console c= System.console();
        System.out.println("Escribe tu nombre");
        System.out.println("");
        String n= c.readLine();
        System.out.println("Bienvenido: "+n);
    }
}
