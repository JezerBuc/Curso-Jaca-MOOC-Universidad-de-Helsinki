//no pase la prueba
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNums = 0;
        int numOfPositiveNums = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }else if (num > 0){
                
                positiveNums = positiveNums + 1;
                numOfPositiveNums = numOfPositiveNums + num;
                
                
                
            }else {
                System.out.println("No se puede calcular el promedio: ");
            }
            
            
        }//while
        double promedio = (double) numOfPositiveNums / positiveNums;
        System.out.println("Average of the numbers: " +  promedio);
        
        
        
        
        

    }//main
}//class


/*
Escriba un programa que pida entrada al usuario hasta que el usuario introduzca 0. 
Después de esto, el programa imprime el promedio de los números positivos (números que son mayores de cero).

Si no se introduce un número positivo, el programa imprime "No se puede calcular el promedio"

A continuación a algunos ejemplos de la salida de los programas
Salida de la muestra

3
5
1
-3
0
3.0
Salida de la muestra

0
No se puede calcular el promedio
Salida de la muestra

-3
1
0
1.0
Salida de la muestra

1
1
0
1.0

*/