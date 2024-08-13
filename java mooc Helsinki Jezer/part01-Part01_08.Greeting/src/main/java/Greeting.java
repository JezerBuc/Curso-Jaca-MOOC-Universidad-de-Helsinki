
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        System.out.println("What is your name?");
        System.out.println(message);
        System.out.println("Hello " + message);

    }
}
