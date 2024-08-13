/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Whistle {
    private String sound;
    
    public Whistle(String sound){
        this.sound = sound;   
    }//contructor
    
    public void sound(){
        System.out.println(sound);
        
    }//metodo
    
    
}//class

/*
Crear una clase de nombre Whistle. Añadir la variable private String sounda la clase. 
Después de eso, crear el constructor public Whistle(String whistleSound), que se utiliza para crear un 
nuevo silbato que se le da un sonido.

Entonces crea el método public void sound()Eso imprime el sonido del silbato.

*/
