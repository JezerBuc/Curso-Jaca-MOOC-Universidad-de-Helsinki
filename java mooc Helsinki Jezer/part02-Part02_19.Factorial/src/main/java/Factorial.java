
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        int factorial= 1;
        
        for(int i=1; i<=num; i++){
            
            factorial = factorial*i;
            
        }//for
        
        System.out.println(factorial);
        
        
        
        
        
        
        

    }//main
}//class factorial

/*
Implemente un programa que calcese el factor de un número dado por el usuario.

Factorial de n, denotado n!, se calcula como 1* 2*3 * * * * * * n. Por ejemplo, el factor de 4 es de 24 o 4o ? 1 * 2 * 3* 4 ?24. 
Me han puesto ese factor de 0 es 1, así que 0 . 1.

Salida de la muestra:
Salida de la muestra

Dar un número: 3
Factorial: 6

El cálculo interno aquí fue 1*2*3 n 6
Salida de la muestra

Dar un número: 10
Factorial: 3628800

Y ahora el cálculo interno era de 1*2*3** * 8*9*10 ?3628800

*/
