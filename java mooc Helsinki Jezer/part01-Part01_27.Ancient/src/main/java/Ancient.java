
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escriba el año");
        int year = Integer.valueOf(scan.nextLine());
        if (year < 2015){
            System.out.println("Historia antigua");
        }
    }
}
