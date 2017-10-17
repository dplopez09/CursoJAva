/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes;

/**
 *
 * @author HP
 */
public class Contador {
    //int i=0;  //contador
    static int i=0; //contador statico
    Contador(){
     i++;
     System.out.println(i);
    }
    public static void main (String[]args){
        Contador c1=new Contador();
        Contador c2=new Contador();
        Contador c3=new Contador();

    }
}
