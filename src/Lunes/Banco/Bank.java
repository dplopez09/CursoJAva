/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes.Banco;

public class Bank {
   float getRateOfInterest(){
       return 0;
   }
}
class SBI extends Bank{
    float getRateOfInterest(){
       return 8.2f;
   }
}
class ICICI extends Bank{
     float getRateOfInterest(){
       return 5.3f;
   }
}
class AXIS extends Bank{
     float getRateOfInterest(){
       return 6.2f;
   }
}
class Test{
    public static void main(String[] args) {
        //redefinicion
        SBI s=new SBI();
        ICICI i=new ICICI();
        AXIS a=new AXIS(); 
        System.out.println("Tasa de interes por redefinicion");
        System.out.println("LA tasa de interes en SBI es:"+ s.getRateOfInterest());
        System.out.println("LA tasa de interes en ICCI es:"+ i.getRateOfInterest());
        System.out.println("LA tasa de interes en AXIS es:"+ a.getRateOfInterest());
        
        //polimorfismo
        System.out.println("Tasa de interes por polimorfismo");
        Bank b;
        b=new SBI();
        System.out.println("LA tasa de interes en SBI es:"+ b.getRateOfInterest());
        b=new ICICI();
        System.out.println("LA tasa de interes en SBI es:"+ b.getRateOfInterest());
        b=new AXIS();
        System.out.println("LA tasa de interes en SBI es:"+ b.getRateOfInterest());
    }
}
