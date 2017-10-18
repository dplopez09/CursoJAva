
package Miercoles;

//Nombre, ID, Prioridad, estado, current thread, isalive, daemon
public class TestN extends Thread{
    public void run(){
        System.out.println("Running");
    }
    public static void main(String[] args) {
        TestN n1=new TestN();
        TestN n2=new TestN();
        System.out.println("Nombre n1:"+n1.getName());
        System.out.println("Nombre n2:"+n2.getName());
        
        System.out.println("ID n1:"+n1.getId());
        System.out.println("ID n2:"+n2.getId());
        
        System.out.println("Prioridad n1:"+n1.getPriority());
        System.out.println("Prioridad n2:"+n2.getPriority());
        
        System.out.println("Estado n1:"+n1.getState());
        System.out.println("Estado n2:"+n2.getState());
        
        
        System.out.println("Nombre n1:"+Thread.currentThread().getState());
        System.out.println("Nombre n2:"+Thread.currentThread().getState());
        n1.start();
        n2.start();
    }
}
