
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un número");
        int number = Integer.valueOf(scan.nextLine());
        if (number > 0){
            System.out.println("El número es positivo");
        }else{
            System.out.println("El número es negativo");
        }
    }
}
