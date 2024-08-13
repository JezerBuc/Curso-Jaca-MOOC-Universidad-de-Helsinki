
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer número:");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Dame el segundo número:");
        int y = Integer.valueOf(scanner.nextLine());
        System.out.println(x + "*" + y +"? " + (x * y));
        

    }
}
