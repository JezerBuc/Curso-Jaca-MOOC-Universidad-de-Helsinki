
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el primer número");
        int x = Integer.valueOf(scan.nextLine());
        System.out.println("Ingresa el primer número");
        int y = Integer.valueOf(scan.nextLine());

        if (x > y){
            System.out.println("El mayor número es: " + x);
        }else if (x < y){
            System.out.println("El mayor número es: " + y);
        }else if (x == y){
            System.out.println("Los números son iguales.");
        }

    }
}
