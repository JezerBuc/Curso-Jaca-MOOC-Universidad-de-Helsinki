
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        
        if (num > num2){
            System.out.println(num + " greater than " + num2);
            
        }else if (num < num2){
            System.out.println( num + " smaller than " + num2);
        }else {
            System.out.println(num + " equal to " + num2);
        }
            

        

    }//main
}//class comparing
/*

Escriba un programa que lea dos números enteros del usuario. 
Si el primer número es mayor que el segundo, las impresiones del programa son mayores que.
Si el primer número es menor que el segundo, las impresiones del programa son menores que (segundo) 
El 1o de la Primera parte es igual a (segundo). El (primero) y (segundo) debe sustituirse siempre 
por los números reales que proporcionaron el usuario.

Algunos ejemplos del comportamiento esperado:
Salida de la muestra

8
4
8 es mayor que 4.
Salida de la muestra

-3
5
- 3 es menor que 5.
Salida de la muestra

1
1
1 es igual a 1.
*/
