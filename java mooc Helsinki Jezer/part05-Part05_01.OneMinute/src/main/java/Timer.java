/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Timer {
    
    private ClockHand seconds;
    private ClockHand centecimasSec;
    
    public Timer(){
        
        this.seconds= new ClockHand(60);
        this.centecimasSec = new ClockHand(100);
        
    }//constructor 
    
    public void advance(){
        this.centecimasSec.advance();
        if(this.centecimasSec.value()==0){
            this.seconds.advance();
            
        }//if       
        
    }//metodo 
    
    public String toString(){
        return this. seconds + ":" + this.centecimasSec;
        
    }//toString
    
    
    
    
// 100 = 0
//60 =0
    
    
}//clase Temporizador 


/*


El cronósmo tiene dos manos, una por 100 de segundo y otra por segundos. 
A medida que avanza, el número de centésimas de segundo crece por uno.
Cuando la mano correspondiente a 100 veces un valor de 100, su valor se fija a cero,
y el número de segundos crece en uno. De la misma manera, 
cuando el valor de la mano a segundos al valor correspondiente de sesenta, su valor 
se fija a cero.

    public Timer()Crea un nuevo temporizador.
    public String toString()devuelve una representación en cadena del temporizador. 
La representación de cuerdas debe estar en la forma de "segundos: centésimas de segundo", 
donde ambas centésimas de segundo están representadas por dos números. Por ejemplo, 
"19:83" representaría el tiempo 19 segundos, 83 centésimas de segundo.
    public void advance()mueve el cronósmo hacia adelante por centésima de segundo.

Una vez que haya completado la tarea, devuévella al servidor.

Puedes probar la funcionalidad del temporizador en el programa principal que te guste. El siguiente código de ejemplo te proporciona un programa donde el temporizador 
se imprime y avanza una vez cada centésima de segundo.

*/
