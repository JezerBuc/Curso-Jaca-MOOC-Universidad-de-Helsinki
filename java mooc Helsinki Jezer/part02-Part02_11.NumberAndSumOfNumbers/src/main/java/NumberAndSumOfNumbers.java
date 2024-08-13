
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numsOfNums = 0;
        int sumaOfNums = 0;
        
        while(true){
            System.out.println("Give a number: ");
            int num = Integer.valueOf(scanner.nextLine());
            if (num ==0){
                break;
            }else{
                numsOfNums = numsOfNums+1;
                sumaOfNums = sumaOfNums + num;
                continue;
            }
            
        }//while
        
        System.out.println("Sum of the numbers: " + sumaOfNums +   "Number of numbers: "+numsOfNums );
       
        
        
        

    }//main
}//class


/*
Escriba un programa que pida entrada al usuario hasta que el usuario introduzca 0. 
Después de este programa imprime la cantidad de números. 
El número cero no necesita ser añadido a la suma, pero no cambia los resultados.

Necesitas dos variables para hacer un seguimiento de la información. 
Utiliera uno para hacer un seguimiento de la entrada de números y otro para hacer un seguimiento de la suma

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
Suma de los números: 34


*/