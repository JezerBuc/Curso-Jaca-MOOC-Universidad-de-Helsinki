
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int x = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            String[] sp = input.split(",");
            if (input.equals("")) {
                break;
            }//if   
            age = Integer.valueOf(sp[1]);
            if (age > x) {
                x = age;
                name = sp[0];
            }//if
        }//while
        System.out.println("Name of the oldest: " + name);
    }//main
}//class

/*
Escriba un programa que lea nombres y edades del usuario hasta que se introduce una línea vacía. 
El nombre y la edad están guardados por una coma.

Después de leer todas las entradas del usuario, el programa imprime el nombre de la persona más antigua. 
Puedes asumir que el usuario entra al menos en una persona, 
y el de los usuarios es más viejo que los demás.

*/