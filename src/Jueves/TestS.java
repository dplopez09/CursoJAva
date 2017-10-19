
package Jueves;
class MThread extends Thread{
    public void run(){
        System.out.println("Shutdown task");
    }
}
public class TestS extends Thread{
    public static void main(String[] args) throws Exception{
        Runtime r=Runtime.getRuntime();
        r.addShutdownHook(new MThread());
        
        System.out.println("No main press ctrl+c");
        try{
            Thread.sleep(3000);
        }catch(Exception e){e.printStackTrace();}
    }
}
