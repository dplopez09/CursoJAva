/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Interfaces.pruebas;

import Martes.Interfaces.Bank;

class SBI implements Bank{
    public float getRateOfInterest(){
        return 9.15f;
    }
}
class PNB implements Bank{
    public float getRateOfInterest(){
        return 9.7f;
    }
}
class ICICI implements Bank{
    public float getRateOfInterest(){
        return 9.9f;
    }
}
public class Test2 {
    public static void main(String[] args) {
        Bank b=new SBI();
        System.out.println("ROI:"+b.getRateOfInterest());
    }
}
