
import com.sun.tools.javac.parser.ScannerFactory;


public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }//main

    public static void printArrayInStars(int[] array) {
       
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i]; j++){
                System.out.print("*");    
            }
   
            System.out.println("");

        }
    }// printArrayInStars
    
    /*
    En la clase llamada 'Printer' para hacerla imprimir una fila de estrellas para cada número en la matriz. 
    El número de estrellas se define por el número del número de la matriz.

    Puedes probar la impresión con este ejemplo.

    int[] array = {5, 1, 3, 4, 2};
    printArrayInStars(array);

    Salida de la muestra
    *********
    *
    ***
    ****
    **
    
    */

}//class Printer
