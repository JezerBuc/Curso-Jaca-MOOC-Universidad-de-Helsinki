import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Books> libros = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Titlle: ");
            String titulo = scan.nextLine();

            if (titulo.isEmpty()) {
                break;
            }//if
                        
            System.out.println("Pages: ");
            int pag = Integer.valueOf(scan.nextLine());

            System.out.println("Publication year: ");
            int fecha = Integer.valueOf(scan.nextLine());
            
            libros.add(new Books(titulo, pag, fecha));

        }//while
        
        System.out.println("What information will be printed? ");
        String input = scan.nextLine();
        
        for(Books libro: libros){
            if(input.contains("everything")){
                System.out.println(libro);
            }else if (input.contains("name")){
                System.out.println(libro.getName());       
            }//else if
            
        }//foreach
    }//main
}//clase Main
