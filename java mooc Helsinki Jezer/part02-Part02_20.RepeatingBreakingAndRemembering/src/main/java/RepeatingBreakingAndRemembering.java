//Paso todos los test :)
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        
        /*
        Implemente un programa que le pida números al usuario (el programa primero imprime "Escribir números: ") hasta que el usuario dé el número -1. 
Cuando el usuario escribe -1, el programa imprime "Thx". Adiós" y termina.
Salida de la muestra

Dar a los números:
5
2
4
-1
Thx. Adiós.
Suma de los números

Exaque el programa para que imprima la suma de los números (sin incluir la cantidad de la cantidad del usuario ha escrito).
Salida de la muestra

Dar a los números:
5
2
4
-1
Thx. Adiós.
Suma: 11
        */
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int suma = 0;
        int count = 0;
        double avg = 0;
        int par = 0;
        int impar = 0;

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());
            if (num == -1) {
                System.out.println("Thx. Bye");
                break;
            } else {
                suma = suma + num;
                count++;
                if (num % 2 == 0) {
                    par++;

                } else {
                    impar++;
                }
            }

            avg = (double) suma / count;

        }//while

        System.out.println("Sum: " + suma);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + avg);
        System.out.println("Even: " + par);
        System.out.println("Odd: " + impar);

    }
}


/*
SOLUCION ESPAÑOL

Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int suma = 0;
        int count = 0;
        double avg = 0;
        int par = 0;
        int impar=0;
        
        while (true){
            
            int num = Integer.valueOf(scanner.nextLine());
            if (num ==-1){
                System.out.println("Thx. Bye");
                break;
            }else {
                suma = suma +num;
                count++;
                    if(num%2==0){
                        par++;
                        
                    }else{
                        impar++;
                    }
            }
            
            avg = (double) suma/count;
            
        }//while
        
        System.out.println(suma);
        System.out.println(count);
        System.out.println(avg);
        System.out.println(par);
        System.out.println(impar);


*/

/*
Suma y el número de números

Exaque el programa para que también imprima el número de números (no incluye el usuario ha escrito.
Salida de la muestra

Dar a los números:
5
2
4
-1
Thx. Adiós.
Suma: 11
Números: 3
Promedio de números

Extóquese el programa para que imprima la media de los números (sin incluir el "ento más" que el usuario ha escrito.
Salida de la muestra

Dar a los números:
5
2
4
-1
Thx. Adiós.
Suma: 11
Números: 3
Media: 3.66666666666666666666666666666666
Incluso números impares

Ampliar el programa para que imprima el número de números pares y impares (el -1).
Salida de la muestra

Dar a los números:
5
2
4
-1
Thx. Adiós.
Suma: 11
Números: 3
Media: 3.66666666666666666666666666666666
Incluso: 2
Extrañás: 1

*/