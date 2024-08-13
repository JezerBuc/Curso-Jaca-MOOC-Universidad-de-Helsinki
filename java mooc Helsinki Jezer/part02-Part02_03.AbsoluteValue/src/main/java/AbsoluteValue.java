
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num < 0 ){
            int result = num*-1;
            System.out.println(result);
            
        }else {
            System.out.println(num);
        }

    }//main
}//class absoluteValue


/*

Escriba un programa que lea un número entero del usuario. Si el número es inferior a 0, 
el programa imprime el entero dado multiplicado por -1. En todos los demás casos, el programa imprime 
el número de sí mismo. A continuación se muestran algunos ejemplos de cómo se espera que funcione el programa:
Salida de la muestra

-3
3

2
2

-5
5
*/