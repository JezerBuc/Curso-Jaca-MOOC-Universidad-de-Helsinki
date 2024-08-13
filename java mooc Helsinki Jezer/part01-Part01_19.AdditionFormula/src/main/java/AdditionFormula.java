
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer numero: ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Dame el segundo numero: ");
        int y = Integer.valueOf(scanner.nextLine());
        System.out.println("x es:" + x + " y es:" + y + "? " + (x+y));
        

    }
}
