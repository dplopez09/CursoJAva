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
public class TEstP extends Thread{
    public void run(){
        System.out.println("corriedo un hilo Llamado"+Thread.currentThread().getName());
        System.out.println("corriedo un hilo con prioridad "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        TEstP t1=new TEstP();
        TEstP t2=new TEstP();
        t1.setPriority(MIN_PRIORITY);
        t2.setPriority(MAX_PRIORITY);
        
        t1.start();
        t2.start();
    }
}
