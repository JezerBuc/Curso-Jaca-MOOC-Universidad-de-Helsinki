
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saludos. Cómo estás?");
        String first = scanner.nextLine();
        System.out.println("Que interesante. Dime más");
        String second = scanner.nextLine();
        System.out.println("Gracias por compartir");
        System.out.println("");
        
        System.out.println("Saludos. Cómo está?");
        System.out.println(first);
        System.out.println("Que interesante. Dime más");
        System.out.println(second);
        System.out.println("Gracias por compartir");
        
        
        
    }
}
