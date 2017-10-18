
package Martes.Figuras;


public class Animales {
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animales{
    void eat(){
        System.out.println("Eating dog chow");
    }
}
class BabyDog extends Animales{
    void eat(){
        System.out.println("Drinking milk...");
    }
    public static void main(String[] args) {
        Animales a1,a2,a3;
        a1=new Animales();
        a2=new Dog();
        a3=new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}