
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Dame un número");
        int number = Integer.valueOf(scan.nextLine());
        if (number % 2 == 0){
            System.out.println("El número " + number + " es par");
        }else {
            System.out.println("El número " + number + " es impar");
        }
        
        scan.close();
    }
}
