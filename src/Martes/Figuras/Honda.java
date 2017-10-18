/*
operador de indireccion "."
Polimorfismo en tiempo de ejecución.
Cuando el polimorfismo se aplica en tiempo de ejecución no es capaz de
redefinir el valor delos atributos.
*/
package Martes.Figuras;

class Bike{
    int speedlimit=90;
}
public class Honda extends Bike {
    int speedlimit=150;
    public static void main(String[] args) {
        Bike obj=new Honda();
        System.out.println(obj.speedlimit);
    }
}
