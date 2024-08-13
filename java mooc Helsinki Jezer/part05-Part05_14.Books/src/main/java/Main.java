
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }//if

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            
            if (books.contains(book)){
                System.out.println("The book is already on the list. Let's not add the same book again.");
                continue;
            }else {
                books.add(book);
            }//else
        }//while
        
        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }//main
}//clase Main

/*
ay un programa en la base de ejercicios que pide libros al 
usuario y los añade a una lista.

Modifica el programa para que los libros que ya están en la
lista no vuelvan a añadirse a ella. Dos libros deben 
considerarse iguales si tienen el mismo nombre y año de 
publicación.

Ejemplo de salida

Nombre (vacío se detendrá):
Bossypants
Año de publicación:
2013

El libro ya está en la lista. No volvamos a añadir el mismo
libro.
Nombre (vacío se detendrá):

Gracias Libros añadidos: 2

*/
