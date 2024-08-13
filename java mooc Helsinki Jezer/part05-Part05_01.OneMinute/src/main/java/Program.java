
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        Timer temp = new Timer();
        while(true){
            System.out.println(temp);
            temp.advance();
            
            try {
                Thread.sleep(10);
                
            }catch(Exception e){
                e.getMessage();
            }
        }//while
        


    }//main
}//clase Program 


/*
La plantilla de ejercicio viene con la clase "ClockHand" descrita anteriormente. Implementar un TimerBasado en el Material 's Clockclase.

El cronósmo tiene dos manos, una por 100 de segundo y otra por segundos. A medida que avanza, el número de centésimas de segundo crece por uno.
Cuando la mano correspondiente a 100 veces un valor de 100, su valor se fija a cero, y el número de segundos crece en uno. De la misma manera, 
cuando el valor de la mano a segundos al valor correspondiente de sesenta, su valor se fija a cero.

    public Timer()Crea un nuevo temporizador.
    public String toString()devuelve una representación en cadena del temporizador. La representación de cuerdas debe estar en la forma de "segundos: centésimas de segundo", 
donde ambas centésimas de segundo están representadas por dos números. Por ejemplo, "19:83" representaría el tiempo 19 segundos, 83 centésimas de segundo.
    public void advance()mueve el cronósmo hacia adelante por centésima de segundo.

Una vez que haya completado la tarea, devuévella al servidor.

Puedes probar la funcionalidad del temporizador en el programa principal que te guste. El siguiente código de ejemplo te proporciona un programa donde el temporizador 
se imprime y avanza una vez cada centésima de segundo.

*/