package Martes;

/*
Abstración.-Es un proceso para ocultar los detalles
de implmentación y mostrar solo la funcionalidad al 
usuario.
Declaracion:int a;
una clase declarada con la palabrareservada Abstract
se considera abstracta de nombre.
Puede ser Abstracta con metodos no abstractos.

Enviar sms solo escribe el texto y lo envia, no 
conocemos el proceso interno sobre la entrega de mensajes.

Formas de Lograr abstraccion
    1.-Clase Abstracta 0 a 100%
    2.-Interface(100%)
Una clase declarada abstracta debe de ser extendida mediante la
palabra extends e implementar sus metodos.No se puede instancias.
    abstract class A{}
Un metodo declarado abstracto no tiene implementaciones
    abstract void print();
*/
abstract class Bike{
    abstract void run();
}
public class Abstraccion extends Bike {
    @Override
    void run(){
        System.out.println("running...");
    }
    public static void main(String[] args) {
        Bike b=new Abstraccion();
        b.run();
    }    
}
