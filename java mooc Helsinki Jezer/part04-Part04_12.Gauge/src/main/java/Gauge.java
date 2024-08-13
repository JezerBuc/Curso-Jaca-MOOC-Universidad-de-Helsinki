/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Gauge {
    private int value;
    
    public Gauge(){
        this.value =0;
    }//constructor
    
    
    public void increase(){
        if(value<5){
            this.value++;
        }     
    }//metodo incrementar
    
    public void decrease(){
        if(value>0){
            this.value--;
        }
    }//metodo decrementar
    
    public int value(){
        return this.value;
    }//metodo que retorna el valor
    
    public boolean full(){
        if(this.value==5){
            return true;
        }else {
            return false;
        }//if else
        
    }//metodo retorna true si valor = 5;
      
}//clase Gauge

/*







Crear la clase Gauge. El medidor tiene la variable de 
instancia private int value, un constructor 
sin parámetros (establece el valor inicial de la variable 
del medidor a 0), y también los cuatro métodos siguientes:


*Method public void increase() incrementa en uno el valor de la
variable de instancia value. No incrementa el valor más 
allá de cinco.

*Method public void decrease() reduce el valor de la 
variable de instancia value en uno. No disminuye el valor 
a números negativos.

*El método public int value() devuelve el valor de la 
variable value.

*Method public boolean full() devuelve verdadero si el 
valor de la variable de instancia tiene el valor cinco.
En caso contrario, devuelve false.
*/
