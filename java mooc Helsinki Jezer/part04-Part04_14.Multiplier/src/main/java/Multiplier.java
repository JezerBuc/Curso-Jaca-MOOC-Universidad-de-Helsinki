/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Multiplier {
    private int number;
    
    public Multiplier(int numero){
        this.number=numero;
        
    }//constructor
    
    public int multiply(int num){
        return num*this.number;
        
    }//metodo
    
}//Clase Multiplicador

/*
Crea una clase Multiplicador que tenga un:

Constructor public Multiplicador(int número).
Método public int multiply(int number) que devuelve 
el valor number que se le ha pasado multiplicado por 
el número proporcionado al constructor.

En este ejercicio también debes crear una variable de instancia.

*/
