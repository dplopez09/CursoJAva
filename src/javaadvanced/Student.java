/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced;

/**
 *
 * @author HP
 */
public class Student {
    int id;
    String nombre;
    int edad;
    String msg;
    
    //default
    Student(){System.out.println("Soy un Constructor"); }
    //con dos parametros
    Student(int i, String n){
        id=i;
        nombre=n;
    }
    //con 3 parametros
    Student(int i, String n, int c){
        id=i;
        nombre=n;
        edad=c;
    }
    void display(){System.out.println(id+" "+nombre);}
    public static void main(String[]args){
        Student student=new Student();
        Student student2=new Student(111,"Dennis");
        Student student3=new Student(111,"Dennis",26);
        student.display();
        student2.display();
        student3.display();
    }
}
