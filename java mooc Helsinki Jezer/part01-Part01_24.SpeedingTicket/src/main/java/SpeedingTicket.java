
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dar velocidad: ");
        int x = Integer.valueOf(scanner.nextLine());
        if (x > 120){
            System.out.println("Billete de velocidad.");
        }
    }
}
