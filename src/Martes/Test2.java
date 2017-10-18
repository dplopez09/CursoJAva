/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

abstract class Bikes{
    Bikes(){
        System.out.println("La bicicleta se ha creado");
    }
    abstract void run();
    void changeColor(){
        System.err.println("Color Cambiado");
    }
}
class Honda2 extends Bikes{
    void run(){
        System.err.println("Corriendo");
    }
}
public class Test2 {
    public static void main(String[] args) {
        Bikes ob=new Honda2();
        ob.run();
        ob.changeColor();
    }
    
}
