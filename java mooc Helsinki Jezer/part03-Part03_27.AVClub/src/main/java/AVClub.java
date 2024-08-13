
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            String[] separarInput = input.split(" ");
            if (input.equals("")) {
                break;
            } else {
                for (int i = 0; i < separarInput.length; i++) {
                    if (separarInput[i].contains("av")) {
                        System.out.println(separarInput[i]);
                    }//if
                }//for

            }//if else

        }//while

    }//main
    
}//class

    /*
    Para cada línea no vacía, el programa debe dividir la cadena por espacios y 
    luego imprimir las partes que contienen la subcadena "av", cada una en una nueva línea.

    Por ejemplo, si la entrada es:

    arduino

    "Do you have a favorite flavor"
    "was it a cat?"

    La salida debería ser:

    have
    favorite
    flavor

    Consejo Las cadenas tienen un método contains, que indica si una cadena contiene otra cadena. Funciona así

    Cadena text = «vulcanólogo»;

    if (text.contains(«can»)) {
        System.out.println(«se encontró can»);
    }

    if (!text.contains(«lata»)) {
        System.out.println(«no se encontró lata»);
    }

    Ejemplo de salida
    
    */
