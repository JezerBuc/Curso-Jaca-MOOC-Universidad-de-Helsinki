
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Te contaré una historia, pero primero necesito información");
        System.out.println("Cómo se llama el personaje principal?");
        String name = scanner.nextLine();
        System.out.println("Cuál es su trabajo?");
        String job = scanner.nextLine();
        System.out.println("Aqui esta la historia:");
        System.out.println("Habia una vez un " + job);
        System.out.println("De camino al trabajo, " + name + " se ha visto reflejado en la vida.");
        System.out.println("Entonces, " + name + " no sera un constructor para siempre");
        

    }
}
