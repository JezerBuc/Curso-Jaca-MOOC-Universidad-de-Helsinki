
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }//main

    public static void printNeatly(int[] array) {
        for(int i=0; i<array.length; i++){
            if(i == array.length -1){
                System.out.print(array[i]);
            }else {
                System.out.print(array[i] +", ");
            }//if else
            
        }//for
    }//printNeatly
    
    /*
    Completar el método public static void printNeatly(int[] array)En la clase llamada 'ArrayPrinter'
    para que imprima los números de la matriz que recibe con más cuidado. 
    Debería haber un espacio en blanco y una coma entre cada número. No pongas una coma después del último número.

    Imprime los números en una línea usando System.out.print.

    Puedes probar tu impresión con este ejemplo:

    int[] array = {5, 1, 3, 4, 2};
    printNeatly(array);

    Salida de la muestra

    5, 1, 3, 4, 2
    
    */
}//class
