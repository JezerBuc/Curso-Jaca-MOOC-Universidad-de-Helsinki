
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }//if

            list.add(input);
        }//while
        
        System.out.println("The greatest number: ");
        int numeroMasGrande = list.get(0);
        
        
        for (int number : list) {
            if (number > numeroMasGrande) {
                numeroMasGrande = number;
            }
        }//for
        
        System.out.println("The greatest number: " + numeroMasGrande);
        
    }//main
    
    /*
   inúa desarrollando el programa para que encuentre el mayor número de la lista e imprima su valor después de 
    leer todos los números. La programación debería funcionar de la siguiente manera.
    Ejemplo de salida

    72
    2
    8
    93
    11
    -1

    El mayor número: 93
    
    */
}//class GreatestInList
