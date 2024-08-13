
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
       
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);

            
    }//main
    
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lower, int higher){
        
        for (int number : numbers){
            if (number >= lower && number <= higher){
                System.out.println(number);
            }
        }
        
    }//printNumbersInRange
    
}//class


/*
El método imprime los números de la lista dada cuyos valores están en el rango. 
A continuación se suministran algunos ejemplos de uso del método.


Salida de la muestra

Los números en el rango [0, 5]
3
2
5
1
Números en el rango [10]
3
6
5

*/