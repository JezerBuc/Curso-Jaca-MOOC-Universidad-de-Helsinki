
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba un número");
        int x = Integer.valueOf(scan.nextLine());
        if (x==1984){
            System.out.println("Orwell");
        }
    }
}
