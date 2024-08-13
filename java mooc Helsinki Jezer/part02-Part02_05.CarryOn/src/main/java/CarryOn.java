
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Shall we carry on?");
            String input = scanner.nextLine();
            if (input.equals("no")){
                break;
 
            }
          
        }//while
        System.out.println("bye");

    }//main
}//class carryOn

/*

Escriba un programa utilizando el ejemplo del bucle que pregunta "Deseamos continuar?" hasta que el 
usuario insita la cadena "no".

Salida de la muestra

Vamos a llevar?
Sí,
Vamos a llevar?
-
Vamos a llevar?
Y
Vamos a llevar?
No, no
*/
