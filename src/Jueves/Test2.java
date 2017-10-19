
package Jueves;


public class Test2 {
    public static void main(String[] args) throws Exception{
        Runtime r= Runtime.getRuntime();
        r.addShutdownHook(new Thread(){
        public void run(){
            System.out.println("Shutdown"+"hook task complete");
        }});
        System.out.println("No main press ctrl+c to exit");
        try{
            Thread.sleep(4000);
        }catch(Exception e){e.printStackTrace();};
    }
}
