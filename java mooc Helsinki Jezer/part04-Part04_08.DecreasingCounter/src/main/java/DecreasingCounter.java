
public class DecreasingCounter {

    private int value;
    
    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }//constructor

    public void printValue() {
        System.out.println("value: " + this.value);
    }//metodo printValue

    public void decrement() {
            if(value>0){
                value = value-1; 
            }//if          
        System.out.println("value: "+ value);   
    }//metodo decrement

    public void reset(){
        this.value=0;
        System.out.println("value:" + value);
        
    }//metodo reset
}//clase DecreasingCounter

/*
Aplicación del método de decremento ()

Implementar la decrement()método en el cuerpo de clase de 
tal manera que decreta valueEs llamado por uno. 
Una vez que hayas terminado con el decrement()método,
el programa principal del ejemplo anterior debería 
trabajar para producir la salida de ejemplo.

value: 10
value: 9
value: 8

*/
