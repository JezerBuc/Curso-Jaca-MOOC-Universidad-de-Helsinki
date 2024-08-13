
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>(); 
        
 
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }//else
            
            
            
            
            list.add(input);
        }//while
        
        String primerValor = list.get(0);
        String ultimoValor = list.get(list.size()-1);
        System.out.println(primerValor);
        System.out.println(ultimoValor);
        

    }//main
    /*
    
    Modifique el programa para que imprima tanto el primer valor como el último una vez finalizada la lectura. 
    Puede suponer que se leen al menos dos valores en la lista.
    Ejemplo de salida

    Tom
    Emma
    Alex
    Mary

    Tom
    Mary
    */
    
}//class FirstAndLast
