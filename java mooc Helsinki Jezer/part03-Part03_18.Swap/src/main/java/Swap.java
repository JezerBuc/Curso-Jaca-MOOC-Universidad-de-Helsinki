
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }//while
        System.out.println("");

        System.out.println("Give two indices to swap:");
        //System.out.println("Dar 2 indices a intercambiar:");
        int indice1 = scanner.nextInt();
        int indice2 = scanner.nextInt();
        
        int temp = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = temp;
                


        System.out.println("");
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }//while
        
    }//main
    
    /*
    Después de la primera impresión, el programa debe pedir dos índices al usuario. 
    Los valores en estos dos índices deben ser intercambiados, y al final de los valores del array deben 
    imprimirse una vez más.
    Salida de la muestra

    1
    3
    5
    7
    9

    Dar dos índices para intercambiar:
    2
    4

    1
    3
    9
    7
    5
    
    */

}//class swap
