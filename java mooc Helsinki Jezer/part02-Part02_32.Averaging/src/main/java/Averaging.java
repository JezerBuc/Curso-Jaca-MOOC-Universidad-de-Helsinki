
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        
        int suma = number1+number2+number3+number4;
        return suma;
    }//sum

    public static double average(int number1, int number2, int number3, int number4) {
        
        int totalSum = sum(number1,number2,number3,number4);
        
        return (double)totalSum/4;
    }//promedio

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }//main
}//class averaging

/*
Crear un método llamado averageEse es el promedio de los números pasados como parámetros. 
El método creado anterior sumDebe ser utilizado dentro de este método.

Definir el método en la siguiente plantilla:

La salida del programa:
Salida de la muestra

Promedio : 3,5

*/
