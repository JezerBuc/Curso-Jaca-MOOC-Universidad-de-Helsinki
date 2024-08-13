
import java.util.ArrayList;
import java.util.Scanner;

public class SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }//
            
            numbers.add(number);
            
            
            
        }//while
        int num = numbers.get(1);
        int num2 = numbers.get(2);
        int suma =num+num2;
        

        System.out.println(suma);
    }//main
    
    
    /*
    Modificar el programa es que en lugar del primer valor, el programa imprime la suma de los números
    segundo y tercero. El programa se permite mal desfectar si hay menos de tres entradas en la lista, 
    así que no necesite preparar un evento de este tipo en absoluto.
    
    Salida de la muestra

    1
    3
    5
    7
    0
    8
    
    */
}//class
