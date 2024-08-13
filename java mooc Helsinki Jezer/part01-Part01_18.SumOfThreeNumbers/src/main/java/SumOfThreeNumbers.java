
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dame el primer número:");
        int numberOne = Integer.valueOf(scanner.nextLine());
        System.out.println("Dame el segundo número:");
        int numberTwo = Integer.valueOf(scanner.nextLine());
        System.out.println("Dame el tercer número:");
        int numberThree = Integer.valueOf(scanner.nextLine());
        System.out.println("La suma de los numeros es igual a: " + (numberOne + numberTwo + numberThree));
        
        

    }
}
