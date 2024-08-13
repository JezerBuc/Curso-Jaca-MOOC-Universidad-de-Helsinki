
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Constraseña?");
        String password = scan.nextLine();
        if (password.equals("Caput Draconis")){
            System.out.println("Bienvenido");
        }else System.out.println("Acceso denegado");
        
        scan.close();
    }//main
}//class password
