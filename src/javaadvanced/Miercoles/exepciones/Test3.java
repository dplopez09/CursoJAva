/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced.Miercoles.exepciones;

/**
 *
 * @author HP
 */
public class Test3 {
    public static void main(String[] args) {
        try{
            try{
                System.out.println("Division");
                int b=30/0;
            }catch(ArithmeticException ae){
                 System.out.println(ae);
            }finally{
                System.out.println("Boque Final");
            }
            try{
                int a[]=new int[5];
                a[5]=30/1;

            }catch(ArrayIndexOutOfBoundsException aioe){
                System.out.println(aioe);
            }finally{
                System.out.println("Boque Final");
            }
        }catch(Exception e){
            System.out.println(e);
        }
        finally{
                System.out.println("Boque Final");
        }
    }
}
