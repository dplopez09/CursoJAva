/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.exepciones.Carrera;

/**
 *
 * @author HP
 */
public class Liebre implements Runnable{
    public void run(){
        int i=0;
        System.out.println("Inicia la liebre");
        while (i<5){
        try{
            Thread.sleep(250);
            System.out.println("da un paso la liebre");
            }catch(InterruptedException ie){System.out.println(ie);}
            i++;
        }
        System.out.println("Termino la liebre");
    }
}
