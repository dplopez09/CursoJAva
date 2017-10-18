/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes;

class Vehicle{
    void run(){
        System.out.println("El vehiculo esta corriendo");
    }
}
public class Bike extends Vehicle{
    void run(){
        System.out.println("La Bicicleta esta corriendo");
    }
    public static void main(String[] args) {
        Bike b= new Bike();
        b.run();
    }
}
