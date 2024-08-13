
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int suma = 0;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            
        }//while
        
        for (int num : list){
            suma = suma+num; 
        }//for
        
      

        System.out.println("Sum of A List: " + suma);

    }//main
    
    /*
 
    Modifica el programa para que después de leer los números calcule e imprima la suma de los números de la lista.
    Ejemplo de salida

    72
    2
    8
    11
    -1

    Suma: 93
    
    */
}//class

