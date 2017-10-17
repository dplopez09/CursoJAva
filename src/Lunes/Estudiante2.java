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
public class Estudiante2 {
    int matricula;
    String nombre, msg="";
    static String escuela="ITL";
    static void cambio(){
        escuela="DD";
    }
    Estudiante2(int i, String n){
        matricula=i;
        nombre=n;
    }
    void display(){
     msg+="MAtricula:"+matricula;
     msg+="\nNombre:"+nombre;
     msg+="\nEscuela:"+escuela;
     System.out.println(msg);
    }
    public static void main(String[] args) {
        Estudiante2.cambio();
        Estudiante2 s4=new Estudiante2(111,"Paul");
        Estudiante2 s5=new Estudiante2(112,"Dennis");
        Estudiante2 s6=new Estudiante2(113,"Alonso");
        
        s4.display();
        s5.display();
        s6.display();
    }
}
