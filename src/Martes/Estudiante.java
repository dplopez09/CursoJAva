/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Martes;

/**
 *
 * @author HP
 */
public class Estudiante {
    int matricula;
    String nombre;
    String msg="";
    String escuela="ITL";
    Estudiante (int matricula, String nombre){
        this.matricula=matricula;
        this.nombre=nombre;
    }
    void display(){
        msg+="matricula:"+matricula;
        msg+="\nnombre:"+nombre;
        msg+="\nescuela:"+escuela;
        System.out.println(msg);}
    public static void main(String[] args){
        Estudiante s1= new Estudiante(11,"David");
        Estudiante s2= new Estudiante(12,"Desire");
        
        s1.display();
        s2.display();
    }
}
