
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("introduza un número (si el número es = 4 se detiene el programa)");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 4){
                break;
            }
            System.out.println("tu número es: " + num);
        }
        System.out.println("Gracias haz ingresado el número 4");

    }//main
}//class

/*

Escriba un programa, al ejemplo, que el usuario para introducir valores hasta que introduzca el valor 4.
Salida de la muestra

Dale un número:
5
Dale un número:
744
Dale un número:
22
Dale un número:
-1
Dale un número:
4
*/


/* SOLUCION EN ESPAÑOL 

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("introduza un número (si el número es = 4 se detiene el programa)");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 4){
                break;
            }
            System.out.println("tu número es: " + num);
        }
        System.out.println("Gracias haz ingresado el número 4");

    }//main
}//class



import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            if (num == 4){
                break;
            }
            System.out.println(num);
        }

    }//main
}//class
*/
