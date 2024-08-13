
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Que edad tienes");
        int edad = Integer.valueOf(scan.nextLine());
        if (edad >= 18){
            System.out.println("Eres un adulto");
        }else {
            System.out.println("No eres un adulto");
        }
    }
}
