/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Counter {
    private int value;
    
    public Counter(int valor){
        this.value=valor;

    }//constructor
    
    public Counter(){
        this(0);
    }//constructor
    
    public int value(){
        return value;
    }//valor contador
    
    public void increase(){
        value = value+1;
    }//incrementa el valor ++
    
    public void increase(int valor){
        
        if(valor>0){
            value = value + valor;
            
        }else{
            valor = valor;
        }
    }//incrementa el valor dado
            
    
    public void decrease() {
        if (value >= 0) {
            value = value - 1;

        }
        
    }//decrementa valor--
    
    public void decrease(int valor){

        if(valor>0){
            value = value - valor;
        }else {
            this.value = value;
        }
        

              
    }//decrease valor dado
   
    
    public String toString(){
        return  "Value: " + value;
    }
    
    
}//clase Counter
