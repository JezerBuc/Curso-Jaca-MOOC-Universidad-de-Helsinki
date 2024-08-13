
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter username: ");
        String username = scanner.nextLine();
        System.out.println("Enter password: ");
        String pass = scanner.nextLine();
        
        if(username.equals("alex") && pass.equals("sunshine")){
            System.out.println("You have successfully logged in!");
        }else if(username.equals("emma") && pass.equals("haskell")){
            System.out.println("You have successfully logged in!");
            
        }else {
            System.out.println("Incorrect username or password!");   
        }//if else

    }//main
    
    /*
    Escriba un programa que reconozca a los usuarios lo siguiente:
    
    El programa muestra un mensaje personal o informa de un nombre de usuario o contraseña incorrecto.
    
    Enter username: alex
    Enter password: sunshine
    You have successfully logged in!
    Sample output

    Enter username: emma
    Enter password: haskell
    You have successfully logged in!
    Sample output

    Enter username: alex
    Enter password: thunderstorm
    Incorrect username or password!
    
    */
}//class
