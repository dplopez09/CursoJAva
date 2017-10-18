
package Martes.Interfaces;

public class Pintable implements print {
    public void print(){
        System.out.println("Hola");
    }
    public static void main(String[] args) {
        Pintable p= new Pintable();
        p.print();
    }
}
