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
public class Tortuga extends Thread{
    public void run(){
        int i=0;
        System.out.println("Inicia la tortuga");
        while (i<=5){
            try{
                Thread.sleep(500);
                System.out.println("Da un paso la tortuga");
            }catch (InterruptedException ie){System.out.println(ie);}
            i++;
        }
        System.out.println("YA llego la tortuga");
    }
}
