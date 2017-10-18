

package Miercoles;

//JOIN
public class TestJ extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
                System.out.println(i);
            }catch(InterruptedException ie){System.out.println(ie);}
        }
    }
    public static void main(String[] args) {
        TestJ T1=new TestJ(), T2=new TestJ(), T3=new TestJ();
        T1.start();
        try{
            T1.join();
        }catch(InterruptedException ie){System.out.println(ie);}
        T2.start();
        T3.start();
    }
}
