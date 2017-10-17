/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lunes;

/*
Herencia:Es un mecanismo que permite que un objeto adquiera
la idea de herencia es que puedas:

Existen diversas clasificaciones de relacion de herencia:
Relaciones entre clases:Asociacion, Composicion, Agregacion
y Herencia.

Hay un termino que permite distinguir los distintos tipos
de relaciones, llamado ACOPLAMIENTO.

*-Medida de dependencia que hayt entre 2 modulos,
existen grados de acoplamiento(bajo/alto).
*-Cada clase y metodo hace una sola cosa y la hace bien (COHESION)
numero de tareas que tiene cada clase o metodo.

Es deseable que 2 o mas modulos de un programa mantengan 
alta cohesion y bajo acoplamiento.

Relaciones entre clases:
    Asociación (Es Un):cuando entre 2 o mas clases se da una interaccion
que no modifica en nada el comportamiento de los objetos
antes o despues de teminada la relacion.
a asociacion es un modo de interaccion entre objetos donde
uno utiliza los servicio de otro a corto plazo.
La Asociación es una realacion de objetos debilmente acoplados.

Agregacion(Tiene un):Es una relacion entre objetos que 
afecta el comportamiento entre ellos, mientras que dura la
relacion.Es decir, un objeto depende de los servicios de otro
a largo plazo.

Composición(Contiene un): Cuando un objeto compljo usa otros objetos
permanentemente.La composicion es una realcion entre bjetos
cuya escencia tiene sentido, solo cuando ellos estan acoplados.
Por ultimo podemos decir que la composicion es un tio de agregacion
a muy largo plazo.

Herencia: cuando un objeto tiene las caracteristicas de otro
permanentemente, tendremos una realcion entreobjetos intimamente acoplados
cuya existencia depende de un ancestro padre.
 */
class Empleado{
    float salario=40000;
}
public class Programador extends Empleado {
    int bono=10000;
    public static void main(String [] args){
        String msg="";
        Programador p=new Programador();
        msg+="El salario del programador es:"+p.salario;
        System.out.println(msg);
        System.out.println("El bono es: "+p.bono);
    }
}
