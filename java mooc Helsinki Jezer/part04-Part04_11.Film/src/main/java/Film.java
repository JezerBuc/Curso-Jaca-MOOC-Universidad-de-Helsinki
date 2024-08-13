/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Film {
    private String name;
    private int ageRating;
    
    public Film(String nombre, int clasificacionEdad){
        this.name = nombre;
        this.ageRating = clasificacionEdad;    
    }//constructor
    
    public String name(){
        return this.name;
        
    }//metodo devuelve nombre
    
    public int ageRating(){
        return this.ageRating;
        
    }//metodo devuelve año clasificaciom
    
}//clase Film

/*

*/
