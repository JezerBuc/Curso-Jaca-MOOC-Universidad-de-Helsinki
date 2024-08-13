
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        
        int num = Integer.valueOf(scanner.nextLine());
        
        
        int squaredNum = num*num;
        
        System.out.println("El cuadrado del número " + num + " es igual a: " + squaredNum);

    }
}

/*


Escriba un programa que lea un número entero del usuario e imprima el 
cuadrado del número entero dado, es decir, el entero multiplicado por sí mismo.


4
16
Salida de la muestra

-3
9
Salida de la muestra

5
25
*/