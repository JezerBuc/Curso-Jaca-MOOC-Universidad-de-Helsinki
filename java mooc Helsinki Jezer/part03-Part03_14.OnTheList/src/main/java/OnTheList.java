
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

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
        
        System.out.println("Search for? ");
        String search = scanner.nextLine();
        //boolean contains = list.contains(search);
        
        if (list.contains(search)){
            System.out.println(search+" was found!");
            
        }else {
            System.out.println(search +" was not found!");
        }

    }//main
    
    
    /*
    Añada la siguiente funcionalidad: después de la lectura de las entradas se solicita una cadena más al usuario. 
    El programa entonces dice que la cadena se encontró en la lista o no.
    Salida de la muestra

    Tom
    Emma
    Alex
    Mary

    - Busca? Mary
    Mary fue encontrada.
    
    Search for? Logan
    Logan was not found!

    */
}//class
