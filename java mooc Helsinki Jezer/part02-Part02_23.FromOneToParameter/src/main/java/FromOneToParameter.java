
import java.util.Scanner;



public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(3);

    }//main
    
    public static void printUntilNumber(int number) {
        
        
        
        while(true){
            System.out.println(number=number-1);
        }
        
    }

}//class


/*
Crear el siguiente método en la plantilla de ejercicio: public static void printUntilNumber(int number).
Debe imprimir los números de uno al número de pasados como parámetro. 
A continuación se dan dos ejemplos del uso del método.

public static void main(String[] args) {
    printUntilNumber(5);
}

Salida de la muestra

1
2
3
4
5

*/