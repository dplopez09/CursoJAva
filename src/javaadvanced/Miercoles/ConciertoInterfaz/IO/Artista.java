
package javaadvanced.Miercoles.ConciertoInterfaz.IO;

import javaadvanced.Miercoles.ConciertoInterfaz.*;
import javaadvanced.Miercoles.ConciertoAbstracto.*;
import Martes.*;


public class Artista {
    private String nombre, sexo, genero, instrumento, msg="";
    private int edad;
    
    /*
    GET
    */
    public String getNombre(){
        return nombre;
    }
    public String getSexo(){
        return sexo;
    }
    public String getGenero(){
        return genero;
    }
    public String getInstrumento(){
        return instrumento;
    }
    public int getEdad(){
        return edad;
    }
    /*
    SET
    */
    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre=nombre;
            return true;
        }else return false;
            
    }
    public boolean setSexo(String sexo){
        if(!sexo.isEmpty()){
            this.sexo=sexo;
            return true;
        }else return false;
            
    }
    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero=genero;
            return true;
        }else return false;
            
    }
    public boolean setInstrumento(String instrumento){
        if(!instrumento.isEmpty()){
            this.instrumento=instrumento;
            return true;
        }else return false;
            
    }
    public boolean setEdad(int edad){
        if(edad>0){
            this.edad=edad;
            return true;
        }else return false;
            
    }
    //Constructor
    public Artista(){
    }
    //constructor parametrizado
    public Artista(String nombre, String sexo, String genero, String instrumento, int edad){
        this.nombre=nombre;
        this.edad=edad;
        this.sexo=sexo;
        this.genero=genero;
        this.instrumento=instrumento;
    }
    //
    void display(){
        msg+="Nombre:"+nombre;
        msg+="\nSexo:"+sexo;
        msg+="\nGeneros musicales:"+genero;
        msg+="\nInstrumentos:"+instrumento;
        msg+="\nEdad:"+edad;
        //System.out.println("Nombre:"+nombre+" 
        //Sexo:"+sexo+" Generos Musicales:"+genero+" Instrumento:
        //"+instrumento+" Edad:"+edad);}
        System.out.println(msg);}

}
