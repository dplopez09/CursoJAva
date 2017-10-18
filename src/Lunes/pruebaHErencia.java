/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes;

class Animales{
    void comer(){
        System.out.println("Comiendo....");
    }
}
class Perros extends Animales{
    void ladrar(){
        System.out.println("ladrando....");
    }
}
class Gato extends Animales{
    void maullar(){
        System.out.println("Maullando....");
    }
}
public class pruebaHErencia {
    public static void main(String[] args) {
        Gato g=new Gato();
        g.maullar();
        g.comer();
        
        Perros p=new Perros();
        p.ladrar();
        p.comer();
    }
}
