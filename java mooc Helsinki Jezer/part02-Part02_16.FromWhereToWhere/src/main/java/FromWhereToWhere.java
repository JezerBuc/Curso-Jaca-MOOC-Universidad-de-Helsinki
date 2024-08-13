
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Where? ");
        int num = Integer.valueOf(scanner.nextLine());
        
        System.out.println("de donde? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        for (int inicio=num2; inicio<=num; inicio++){
            System.out.println(inicio);
            
        }
       
    }//main
}//class


/*


El número del usuario es ahora el límite superior de la condición. 
Recuerda eso en Java a <= bCómo ser más pequeño o igual a b.
De dónde

Pregílese al usuario también el punto de partida.
Salida de la muestra

Adónde, adónde? 8
De dónde viene? 5
5
6
7
8

Si el límite superior es menor que el punto de partida, no se imprime nada:
Salida de la muestra

Adónde, adónde? 12
De dónde viene? 16

NB Recuerda que los límites más bajos pueden ser negativos.
*/


/*
parte 1: 
Escriba un programa impresiones en números de 1 a un número dado por el usuario.
Salida de la muestra

Adónde, adónde? 3
1
2
3
Salida de la muestra

Adónde, adónde? 5
1
2
3
4
5

*/