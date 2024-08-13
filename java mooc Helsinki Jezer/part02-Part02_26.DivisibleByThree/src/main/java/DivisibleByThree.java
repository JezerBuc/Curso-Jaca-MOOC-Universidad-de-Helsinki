
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange(2,10);

    }//main
    
    public static void divisibleByThreeInRange(int inicio, int fin){
        /*
        int cont=0;
        while(inicio<=fin){
            
            cont++;
            if(cont%3==0){
                System.out.println(cont);
            }
        }//while
        */
        
        
        for (int i=inicio; i<=fin; i++){
            if(i%3==0){
                System.out.println(i);
            }
            
            
        }
        
        
        
    }//method

}//class


/*
Escriba un método public static void divisibleByThreeInRange(int beginning, int end)Eso imprime 
todos los números divisibles por tres en el rango dado. Los números se imprimirán de los más pequeños a los más grandes.

public static void main(String[] args) {
    divisibleByThreeInRange(3, 6);
}

Salida de la muestra

3
6


public static void main(String[] args) {
    divisibleByThreeInRange(2, 10);
}

Salida de la muestra

3
6
9
*/