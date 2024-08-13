
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer número:");
        double x = Double.valueOf(scanner.nextLine());
        System.out.println("Dame el segundo número:");
        double y = Double.valueOf(scanner.nextLine());
        System.out.println("El promedio es de: " + ((x+y)/2));
        

    }
}
