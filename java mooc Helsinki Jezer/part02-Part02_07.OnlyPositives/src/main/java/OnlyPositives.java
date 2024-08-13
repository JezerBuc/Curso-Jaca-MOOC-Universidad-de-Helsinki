
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Ingresa un número ");
            int numbers = Integer.valueOf(scanner.nextLine());

            if (numbers < 0){
                System.out.println("no apto, ingrese un nuevo número");
                continue;
            }
            if (numbers == 0){
                break;   
            }
            if (numbers > 0){
                int potencia = numbers*numbers;
                System.out.println(potencia);

            }
            
        }//while
            
       

    }//main
}//class


/*
Escriba un programa que le pida números al usuario. Si el número es negativo (más pequeño que cero), 
el programa imprime para el usuario "No apto" número pide y el usuario un nuevo número. 
Si el número es cero, el programa sale del bucle. Si el número es positivo, 
el programa imprime el número a la potencia de dos.
Salida de la muestra

Dale un número:
5
25
Dale un número:
4
16
Dale un número:
-3
Número inadecuado
Dale un número:
1
1
Dale un número:
0

*/


/* solucion español
while(true){
             System.out.println("Give a number ");
        int numbers = Integer.valueOf(scanner.nextLine());
        
        if (numbers < 0){
            System.out.println("no apto");
            continue;
        }
        if (numbers == 0){
            break;   
        }
        if (numbers > 0){
            int potencia = numbers*numbers;
            System.out.println(potencia);
            
        }
            
            
        }//while
            


*/