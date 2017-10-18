
package Martes;

abstract class Bank{
    abstract float getRateOfInterest();
}
class SBI extends Bank{
    float getRateOfInterest(){return 7.73f;}
}
class PNB extends Bank{
    float getRateOfInterest(){return 8.15f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 9.45f;}
}
class Test{
    public static void main(String[] args) {
        Bank b;
        String msg="",msg2="",msg3="";
        b=new SBI();
        msg+="Rate of interest is:";
        msg+=+b.getRateOfInterest();
        msg+=" % ";
        System.out.println(msg);
        
        
        b=new PNB();
        msg2+="Rate of interest is:";
        msg2+=+b.getRateOfInterest();
        msg2+=" % ";
        System.out.println(msg2);
        
        b=new ICICI();
        msg3+="Rate of interest is:";
        msg3+=+b.getRateOfInterest();
        msg3+=" % ";
        System.out.println(msg3);
    }
}
