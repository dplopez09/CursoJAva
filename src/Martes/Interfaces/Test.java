/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes.Interfaces;

interface Drawable2{
    void draw2();
}
class Rec implements Drawable2{
    public void draw2(){
        System.out.println("Drawing a Rectangle");
    }
}
class Cir implements Drawable2{
    public void draw2(){
        System.out.println("Drawing a Circle");
    }
}
public class Test {
    
}
