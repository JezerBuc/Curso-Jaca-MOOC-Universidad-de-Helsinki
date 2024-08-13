
import java.util.ArrayList;
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        
        while(true){
            String input = scan.nextLine();
            if (input.equals("end")){
                break;
            }
            int num = Integer.valueOf(input);
            System.out.println(num*num*num);
            
           
            
        }//while
        

        
        
        

    }//main
}//clase Cubes

/*
Escriba un programa que lea las cadenas del usuario hasta que el usuario introduzca la cadena "final". 
Mientras la entrada no sea "final", el programa debe manejar la entrada como un número entero e imprimir el cubo 
del número proporcionado. A continuación se a continuación se desprenden algunos productos de la muestra
Salida de la muestra

3
27
-1
-1
11
1331
final

*/
