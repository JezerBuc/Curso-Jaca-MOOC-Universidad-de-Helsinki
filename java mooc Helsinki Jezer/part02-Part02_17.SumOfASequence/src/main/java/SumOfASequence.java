
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        int suma = 0;
        int count = 0;
        System.out.println("Last number");
        int last = Integer.valueOf(scanner.nextLine());
        
        while(count<last){
            
            count++;
            suma = count + suma;   
            
        }//while
        
        System.out.println("The sum is:" + suma);
        

   
           
         
    }//main
}//class

/*
Implemente un programa, que calcese la suma de 1 .. . . . . . . . . . . . . . . . . . . .

Salida de la muestra:
Salida de la muestra

El último número? 3
La suma es de 6

El ejemplo anterior calculado 1 - 2 - 3 . 6 .
Salida de la muestra

El último número? 7
La suma es de 28

*/