
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        int suma = 0;
        while(true){
            System.out.println("Give a number: ");
            num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            }else{
                suma = suma + num;
                continue;
                
                

            }//if else

            
           
        }//while
        System.out.println("Sum of the numbers: " + suma);


    }//main
}//class


/*
Escriba un programa que lea los números del usuario hasta el número de entradas de usuario 0. 
Después de este programa se dan las salidas de las cantidades. 
El número cero no necesita ser añadido a la suma, si no cambia los resultados.

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
Suma de los números: 34


*/