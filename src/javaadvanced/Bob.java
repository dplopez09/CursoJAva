/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaadvanced;

/**
 *
 * constructor:Artefacto utilizado para inicializar los objetos
 * Es un conjunto de instrucciones diseñado para inicializar una
 * instancia de clase.
 * En su declaración o encabezado puede aceptar parametros.
 * Bob b=new Bob();
 * Bob() hace referencia al constructor por omisión
 * 
 * Antes de su ejecución, bob, es nul; al final de la llamada "bob"
 * es un apuntador a un objeto (referencia) con espacio reservado
 * en RAM para contener sus valores de atributs y sus apuntadores a metodos.
 * 
 * ¿porque el constructor no es un metodo?
 * No se puede llamar al constructor usando el operador de indireccion
 * arece de un valor de retorno distinto a un apuntador.
 * No puede ser redefinido y no puede ser declarado con un TYPE
 * 
 */
public class Bob {
    Bob(){
        System.out.println("Soy bob el constructor");
    }
    
}
