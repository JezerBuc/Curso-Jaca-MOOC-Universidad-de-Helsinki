
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number");
        int num = Integer.valueOf(scanner.nextLine());
        
        for (int i=0; num > i; num++){
            System.out.println(num);
            
        }
        
        
        /*
        for (*introducing a variable*; *condition*; *increasing the counter*) {
    // Functionality to be executed
}
        */
        

    }//main
}//class

/*
Escriba un programa que lea un número entero del usuario. 
A continuación, el programa imprime los números de 0 al número dado por el usuario. 
Puedes asumir que el usuario siempre da un número positivo. 
A continuación se presentan algunos ejemplos de la funcionalidad esperada.
Salida de la muestra

4
0
1
2
3
4
Salida de la muestra

1
0
1

*/