
import java.util.Scanner;

public class NumberOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int suma = 0;
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }else {
                suma = suma+1;
                continue;
            }
            
        }//while
        
        System.out.println("Number of numbers: " + suma);
        

    }//main
}//class

/*
Escriba un programa que lea valores del usuario hasta que introduzca un 0. 
Después de esto, el programa imprime el número total de valores de entrada. 
El cero que es para salir del bucle no debe incluirse en el conteo de números totales.

Ejemplo del programa:
Salida de la muestra

Dale un número:
5
Dale un número:
22
Dale un número:
9
Dale un número:
-2
Dale un número:
0
Número de números: 4

*/
