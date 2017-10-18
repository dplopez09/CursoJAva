/*
Polimorfismo en tiempo de ejecución
*/
package Martes.Figuras;

class Shape {
    void draw(){System.out.println("Dibujando...");}
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("Dibujando Rectangulo");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Dibujando Circulo");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Dibujando Triangulo");
    }
}
public class TestFiguras{
    public static void main(String[] args) {
        Shape s;
        s=new Rectangle();
        s.draw();
        s=new Circle();
        s.draw();
        s=new Triangle();
        s.draw();
    }
}