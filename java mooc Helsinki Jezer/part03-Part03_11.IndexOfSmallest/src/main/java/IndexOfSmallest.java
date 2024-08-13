
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999){
                break;
            }//if
            lista.add(input);
        }//while
        
        
        
        //imprimir numero mas pequeño en la lista
        int numero = lista.get(0);
        
        for(int numberList: lista){
            if (numberList < numero){
                numero = numberList;
            }
        }//for
        System.out.println("Smallest number: " + numero);
        
        
        //buscar indice del numero
        
        for (int i = 0; i<lista.size(); i++){
            if(numero == lista.get(i)){
                System.out.println("Found at index: " + i);
            }//if
        }//for
        
       
    }//main
    
    
    /*
    Escriba un programa que lea números del usuario. Cuando se introduce el número 9999, el proceso de lectura se detiene.
    Después el programa imprimirá el número más pequeño de la lista, y también los índices donde se encuentra ese número. 
    Nota: el número más pequeño puede aparecer varias veces en la lista.
    
    Sugerencia: combina los programas que escribiste para los ejercicios «Mayor número de la lista» e «Índice del número solicitado». 
    Primero encuentra el número más pequeño, y luego encuentra el índice de ese número.
Ejemplo de salida

72
2
8
8
11
9999

Número más pequeño: 2
Encontrado en el índice: 1
Muestra de resultados

72
44
8
8
11
9999

Número más pequeño: 8
Encontrado en el índice: 2
Encontrado en el índice: 3

Traducción realizada con la versión gratuita del traductor DeepL.com
    */
}//class 
