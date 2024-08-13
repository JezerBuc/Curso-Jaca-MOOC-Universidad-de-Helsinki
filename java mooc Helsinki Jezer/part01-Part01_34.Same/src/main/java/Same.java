
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Introduzca el primer mensaje: ");
        String messageOne = scan.nextLine();
        System.out.println("Introduzca el segundo mensaje: ");
        String messageTwo = scan.nextLine();
        if (messageOne.equals(messageTwo)){
            System.out.println("Los mensajes son iguales");
        }else {
            System.out.println("Los mensajes no son iguales");
        }//if else
    }// main
}//class Same
