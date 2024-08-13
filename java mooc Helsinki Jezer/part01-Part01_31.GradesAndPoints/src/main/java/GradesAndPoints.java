
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese sus puntos  [0-100]");
        int score = Integer.valueOf(scan.nextLine());
        if (score < 0){
            System.out.println("Grado: Imposible"); 
        }else if (score >= 0 && score < 50){
            System.out.println("Grado: Fracasado");
        }else if (score >= 50 && score < 60){
            System.out.println("1");
        }else if (score >= 60 && score < 70){
            System.out.println("2");
        }else if (score >= 70 && score < 80){
            System.out.println("3");
        }else if (score >= 80 && score < 90){
            System.out.println("4");
        }else if (score >= 90 && score < 100){
            System.out.println("5");
        }else {
            System.out.println("Increible");
        }
                          

    }
}
