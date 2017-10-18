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
public class TestD extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread work");
        }else{
            System.out.println("User Thread Work");
        }
    }
    public static void main(String[] args) {
        TestD t1=new TestD();
        TestD t2=new TestD();
        TestD t3=new TestD();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        t3.start();
    }
    
}
