
import java.util.ArrayList;
import java.util.Scanner;

public class RememberTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(scanner.nextLine());
            if (luku == -1) {
                break;
            }
            

            numbers.add(luku);
        }//while
        
        for(int number: numbers){
            System.out.println(number);
        }//for

    }//main
    
    /*
    La plantilla del ejercicio contiene una base que lee números del usuario y los añade a una lista. 
    La lectura se detiene cuando el usuario introduce el número -1.

    Amplía la funcionalidad del programa para que después de leer los números, imprima todos los números 
    recibidos del usuario. El número utilizado para indicar la parada no debe imprimirse.
    Ejemplo de salida

    72
    2
    8
    11
    -1
    
    72
    2
    8
    11
    
    */
}//class RememberTheseNumbers
