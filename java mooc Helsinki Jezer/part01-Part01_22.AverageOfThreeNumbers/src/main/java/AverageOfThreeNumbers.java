
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer número:");
        Double x = Double.valueOf(scanner.nextLine());
        System.out.println("Dame el segundo número:");
        Double y = Double.valueOf(scanner.nextLine());
        System.out.println("Dame el tercer número:");
        Double z = Double.valueOf(scanner.nextLine());
        System.out.println("El promedio es: " + ((x+y+z)/3));

    }
}
