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
public class Test2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/1;
            
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }catch(ArrayIndexOutOfBoundsException aioe){
            System.out.println(aioe);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Lo que sigue");
    }
}
