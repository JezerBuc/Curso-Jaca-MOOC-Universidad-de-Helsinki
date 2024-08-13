/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Song {
    private String name;
    private int length;
    
    
    public Song(String nombre, int longitud){
        this.name = nombre;
        this.length = longitud;
    }//constructor
    
    
    public String name(){
        return this.name;
        
    }//metodo devolver nombre
    
    public int length(){
        return this.length;
        
    }//metodo devolder longitud
    
    
    
    
}//clase Song

/*

Añadir al objeto de los métodos public String name(), 
que devuelve el nombre de la canción, y public int length(), 
que devuelve la longitud de la canción.

La clase debe funcionar de la siguiente manera.

Song garden = new Song("In The Garden", 10910);
System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");

Salida de la muestra
La canción In The Garden tiene una longitud de 10910 segundos.






Crear una clase llamada Song. La canción tiene las
variables de instancia name(cadenación) y lengthen 
los segundos (integer). Ambos están en 
el public Song(String name, int length)Constructor. 

*/
