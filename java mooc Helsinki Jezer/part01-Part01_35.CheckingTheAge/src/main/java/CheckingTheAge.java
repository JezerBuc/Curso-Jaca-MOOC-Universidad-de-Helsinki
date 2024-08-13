
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad =  Integer.valueOf(scan.nextLine());
        if (edad > 0 && edad <= 100 ){
            System.out.println("Ok");
        }else {
            System.out.println("Imposible");
        }

    }//main
}//class checking

