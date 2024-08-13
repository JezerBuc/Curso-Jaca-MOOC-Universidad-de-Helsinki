
import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }//if

            list.add(input);
        }//while
        
        /*
        Cuando el programa termine de leer,totalDeValores imprime el número de valores de la lista.
        */
        int totalDeValores = list.size();
        System.out.println(totalDeValores);

    }//main
    /*
    En la plantilla del ejercicio hay un programa que lee la entrada del usuario. 
    Modifica su funcionamiento para que cuando el programa termine de leer, imprima el número de valores de la lista.
        Ejemplo de salida

        Tom
        Emma
        Alex
        María

        En total: 4
    
    */
    
    
}//class ListSize
