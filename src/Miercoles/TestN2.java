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
public class TestN2 extends Thread{
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        TestN2 t1=new TestN2();
        TestN2 t2=new TestN2();
        
        System.out.println("Nombre T1:"+t1.getName());
        System.out.println("Nombre T2:"+t2.getName());
        
        t1.start();
        t2.start();
        
        t2.setName("Mounstro de Frankeinstein");
        t1.setName("Victor Frankeinstein");
        System.out.println("despues del cambio T1:"+t1.getName());
        System.out.println("despues del cambio T2:"+t2.getName());
    }
}
