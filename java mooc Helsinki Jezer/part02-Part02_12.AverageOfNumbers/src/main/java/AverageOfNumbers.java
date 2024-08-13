
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumaNums = 0;
        int numOfNums = 0;
        
        
       
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 0){
                break;
            } else{
                sumaNums = sumaNums + num;
                numOfNums = numOfNums + 1;
                continue;
                
            }
            
        }//while
        
        double promedio =  (double) sumaNums /numOfNums;
        
        
        System.out.println(" Average of the numbers: " + promedio );
        
        

    }//main
}//class


/*
Escriba un programa que pida entrada al usuario hasta que el usuario introduzca 0. 
Después de esto, el programa imprime el promedio de los números. El número cero no necesita ser contado a la media. 
Usted puede asumir que el usuario introduce al menos un número.

La media de los números se puede calcular dividiendo la suma de los números con el importe de los números

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
Promedio de los números: 8.5

*/