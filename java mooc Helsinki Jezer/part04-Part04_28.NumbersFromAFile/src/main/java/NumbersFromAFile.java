
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int limiteInferior = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int limiteSuperior = Integer.valueOf(scanner.nextLine());
        
        int numbers = 0;
        
        try ( Scanner sc = new Scanner(Paths.get(file))) {

            while (sc.hasNextLine()) {
                int fila = Integer.valueOf(sc.nextLine());
                if (fila <=limiteSuperior && fila >= limiteInferior) {
                    numbers++;
  
                }
      
            }//while
            System.out.println("Numbers: " + numbers);
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            
        }

    }//main

}//clase

/*

Escriba un programa que ansita al usuario por un nombre de archivo, así como los límites superior e inferior para el rango de números aceptado.
A continuación, el programa lee los números contenidos en el archivo (cada número está en su propia línea) y sólo explica los números que están por debajo del rango. 
Finalmente, el programa debe imprimir el número de números que estaban dentro del rango dado.

Usted convierte puede un número entero tipo cadena de un archivo a un número entero apropiado usando 
el comando Integer.valueOf(justo en cuanto a la manipulación de un usuario).
File? numbers-1.txt
Lower bound? 15
Upper bound? 20
Numbers: 2

*/
