
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String input = scanner.nextLine();
        
        ArrayList<String> lista = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(input))){
            while(sc.hasNextLine()){
                lista.add(sc.nextLine());
            }//while
        }catch (Exception e){
            System.out.println("Error: "+ e.getMessage());
        }//catch

        System.out.println("Enter names, an empty line quits.");
        while (true) {
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }//if

            if (lista.contains(name)) {
                System.out.println("The name is on the list.");
            } else {
                System.out.println("The name is not on the list.");
            }//else
        }//while

        System.out.println("Thank you!");
    }
}//clse guestList

/*
La plantilla de ejercicio viene con la funcionalidad de la 
aplicación de lista de invitados. Se comprueba que los nombres 
introducidos por el usuario están en la lista de invitados.

El programa falta la funcionalidad necesaria para la lectura
de la lista de invitados. Modifique el programa para que los 
nombres de la lista de invitados se lean del archivo.

*/
