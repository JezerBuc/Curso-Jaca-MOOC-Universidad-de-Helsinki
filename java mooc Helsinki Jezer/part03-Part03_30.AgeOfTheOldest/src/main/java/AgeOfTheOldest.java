
import java.util.Scanner;


public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        int x = 0;
        while (true) {
            String input = scanner.nextLine();
            String[] separar = input.split(",");
            
            if (input.equals("")) {
                break;
            } else {

                age = Integer.valueOf(separar[1]);
                if (age > x) {
                    x = age;
                }//if

            }//else

        }//while

        System.out.println("Age of the oldest: " + x);

    }//main
}//class

/*
Escriba un programa que lea nombres y edades del usuario hasta que se introduce una línea vacía. 
El nombre y la edad están separados por una coma.

Después de leer todas las entradas de los usuarios, el programa imprime la edad de la edad de la persona más anciana. 
Puedes asumir que el usuario entra al menos en una persona, y que uno de los usuarios es más viejo que los demás.
Salida de la muestra

sebastian,2
lucas,2
Lily,1
Hanna,5
gabriel,10

Age of the oldest: 10
Edad de la más antigua: 10

*/
