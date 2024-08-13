
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }//if
            numbers.add(number);
        }//while

        System.out.println("From where?");
        int inicio = Integer.valueOf(scanner.nextLine());
        System.out.println("To where?");
        int fin = Integer.valueOf(scanner.nextLine());

        for (int i = inicio; i <= fin; i++) {
            System.out.println(numbers.get(i));
        }//for

    }//main
    
    /*
    Amplíe el programa para que pida los índices de inicio y fin una vez que haya terminado de pedir números. 
    Después de esto, el programa imprimirá todos los números de la lista que caigan en el rango
    especificado (entre los índices dados por el usuario, inclusive). Puede suponer que el usuario da índices que 
    coinciden con algunos números de la lista.
    Ejemplo de salida

    72
    2
    8
    11
    -1
    ¿Desde dónde? 1
    ¿Hacia dónde? 2
    2
    8
    
    */
}//class OnlyTheseNumbers
