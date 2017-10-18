/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Miercoles;

/**
 *
 * @author HP
 */
public class MultiHilos extends Thread {
    public void run(){
        System.err.println("Corriendo");
    }
    public static void main(String[] args) {
        String Estado="";
        MultiHilos t1= new MultiHilos();
        t1.start();
        
        System.err.println(t1.getState());
        MultiHilos t2= new MultiHilos();
        System.err.println(t1.getState());
        t1.setName("El Monstruo de Frankestein");
        t2.setName("Victor Frankestein");
        System.err.println("Nombre Hilo 1:" +t1.getName());
        System.err.println("Nombre Hilo 2:" +t2.getName());
        System.err.println("La prioridad es " +t1.getPriority());
        System.err.println("La prioridad es " +t2.getPriority());
        System.err.println("¿El Monstruo de Frankestein esta vivo?:"+t1.isAlive());
        t2.start();
        System.err.println("Victor Frankestein esta vivo: "+t2.isAlive());
        
    }
}
