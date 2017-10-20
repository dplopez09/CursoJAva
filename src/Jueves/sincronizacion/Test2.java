
package Jueves.sincronizacion;

class Mesa2{
    synchronized void mostrarMesa(int n){
        for(int i=0;i<=5;i++){
            System.out.println(n*1);
            try{
                Thread.sleep(400);
            }catch(InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
public class Test2 {
    public static void main(String[] args) {
        final Mesa2 mesa= new Mesa2();
        Thread t1=new Thread(){
            public void run(){
                mesa.mostrarMesa(5);
            }
        };
        Thread t2=new Thread(){
            public void run(){
                mesa.mostrarMesa(100);
            }
        };
        t1.start();
        t2.start();
    }
}
