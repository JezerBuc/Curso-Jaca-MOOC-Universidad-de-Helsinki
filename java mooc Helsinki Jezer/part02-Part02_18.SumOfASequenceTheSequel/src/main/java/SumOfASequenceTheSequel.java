
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("primer numero");
        int num = Integer.valueOf(scanner.nextLine());
        System.out.println("segundo numero");
        int num2 = Integer.valueOf(scanner.nextLine());
        int suma = 0;
        
     
        // Calcula la suma de todos los números en el intervalo
        for (int numero = num; numero <= num2; numero++) {
            suma = suma+numero;
        }//for

        System.out.println("La suma es: " + suma);        

    }
}
/*
El primer número? 3
El último número? 5
La suma es de 12

Primer ejemplo:
Intervalo: 3 a 5
Suma: 3 + 4 + 5 = 12
Internamente, se sumaron los números 3, 4 y 5.

*/



/*
Implemente un programa que calcete la suma de un intervalo cerrado, y lo imprime.
Espere que el usuario escriba el menor número del número.

Puede basar su solución a este ejercicio a la solución del último ejercicio. 
Agregue al usuario para entrar en el punto de partida.

Salida de la muestra:
Salida de la muestra

El primer número? 3
El último número? 5
La suma es de 12

Lo anterior calculado internamente 3 y 4 .
Salida de la muestra

El primer número? 2
El último número? 8
La suma es: 35

Y ahora el cálculo interno fue de 2 3 . 4 5 . 6 . 7 .

*/