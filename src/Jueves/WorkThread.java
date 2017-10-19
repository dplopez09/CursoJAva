
package Jueves;


public class WorkThread implements Runnable{
    private String msg;
    public WorkThread(String s){
        this.msg=s;
    }
    public void run(){
        System.out.println(Thread.currentThread().getName()+
                "(Start) mensaje:"+msg);
        System.out.println(Thread.currentThread().getName()+"(END)");
    }
    private void processMsg(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){ie.printStackTrace();}
    }
}
