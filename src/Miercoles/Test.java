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
public class Test extends Thread {
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(InterruptedException ie){System.out.println(ie);}
        }
    }
    public static void main(String[] args) {
        Test t1=new Test(), t2=new Test();
        //t1.start();
        t1.start();//crea un nuevo hlo
        t2.start();//crea un nuevo hlo
        //t2.run();//depende del otro hilo
    }
}
