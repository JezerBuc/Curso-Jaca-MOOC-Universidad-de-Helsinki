
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el año: ");
        int year = Integer.valueOf(scan.nextLine());
        if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0){
            System.out.println("El año es bisiesto");
        }else {
            System.out.println("El año no es bisiesto");
        }//if else

    }//main
}//class LeapYear
