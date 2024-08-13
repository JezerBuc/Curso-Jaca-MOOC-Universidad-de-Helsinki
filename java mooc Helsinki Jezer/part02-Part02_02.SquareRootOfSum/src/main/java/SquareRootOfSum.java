
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num1 = Integer.valueOf(scanner.nextLine());
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = num1 + num2;

        
        double result = Math.sqrt(sum);
        
        System.out.println(result);




    }
}

/*
Escriba un programa que lea dos números enteros del usuario e imprime la raíz cuadrada de estos enteros. 
El programa no necesita trabajar con valores negativos.

Puedes puedes álsctar la raíz de la Plaza de un número entero con el mando Math.sqrtAsí:

int number = 42;
double squareRoot = Math.sqrt(number);
System.out.println(squareRoot);



*/
