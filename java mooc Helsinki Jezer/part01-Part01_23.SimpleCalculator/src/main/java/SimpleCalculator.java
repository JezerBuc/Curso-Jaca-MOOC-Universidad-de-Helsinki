
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer número");
        double x = Double.valueOf(scanner.nextLine());
        System.out.println("Dame el segundo número");
        double y = Double.valueOf(scanner.nextLine());
        System.out.println((int)x + "?" + (int)y + "?" + " = " + ((int)(x+y)));
        System.out.println((int)x + "-" + (int)y + "?" + " = " + ((int)(x-y)));
        System.out.println((int)x + "*" + (int)y + "?" + " = " + ((int)(x*y)));
        System.out.println((int)x + "/" + (int)y + "?" + " = " + (x/y));
    }
}
