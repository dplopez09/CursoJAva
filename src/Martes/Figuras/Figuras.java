/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Figuras;

abstract class Shape2{
    abstract void draw();
}
class Rectangle2 extends Shape2{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle2 extends Shape2{
    void draw(){
        System.out.println("Drawing circle");
    }
}
public class Figuras {
    public static void main(String[] args) {
        Shape2 s=new Circle2();
        s.draw();
        
    }
}
