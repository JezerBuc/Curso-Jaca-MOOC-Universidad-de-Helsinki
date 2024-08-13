
import java.util.ArrayList;
import java.util.Scanner;

public class LastInList {

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
        
        
        String valoresLista =  list.get(list.size()-1);
        
        System.out.println(valoresLista);
        
     
        

    }//main
    
   
}//class

 /*
    Tu tarea es modificar el método para imprimir el último valor leído después de que se detenga la lectura. 
    Imprime el último valor leído de la lista. Utiliza el método que indica el tamaño de una lista para ayudarte.
    Ejemplo de salida

    Tom
    Emma
    Alex
    María

    Mary

    
    */
