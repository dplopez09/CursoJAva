/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Interfaces.acciones;

import Martes.Interfaces.Drawable.Drawable;

class Rectangle implements Drawable{
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}
public class Figuras {
    public static void main(String[] args) {
        Circle c=new Circle();
        c.draw();
        Rectangle r= new Rectangle();
        r.draw();
    }
}
