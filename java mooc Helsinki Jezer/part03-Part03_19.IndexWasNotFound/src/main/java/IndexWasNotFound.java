

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        for(int i=0; i< array.length; i++){
            
            if(searching ==array[i]){
                System.out.println(searching + " is at index: " + i + ".");
            }else {
                System.out.println(searching + " was not found.");
            }
            
        }//for
        
        
        
    }//main
    
    /*
    
    Completa el programa que le pide al usuario un número para buscar en la matriz. Si la matriz contiene
    el número dado, el programa le indica al índice que contiene el número. Si el número del número no se encuentra.
    Salida de la muestra

    - Busca? 3
    3 está en el índice 4.
    Salida de la muestra

    - Busca? 7
    7 está en el índice 7.
    Salida de la muestra

    - Busca? 22
    22 no fue encontrado.
    
    */

}//class
