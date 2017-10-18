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
public class Test {
    public static void main(String[] args) {
        try {
            int data=50/0;
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("Lo que sigue");
    }
}
