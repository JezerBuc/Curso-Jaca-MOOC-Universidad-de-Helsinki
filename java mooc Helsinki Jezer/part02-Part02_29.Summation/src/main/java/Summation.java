public class Summation {

    public static int sum(int num1, int num2, int num3, int num4) {
        int result = num1+num2+num3+num4;
        return result;
    }//sum

    public static void main(String[] args) {
        int result = sum(4, 3, 6, 1);
        System.out.println("Sum: " + result);
    }//main
    
}//class cummation


/*
Amplie el método sumen la plantilla de ejercicio para que calcese y devuelve la suma de los números 
a los que se les dan los parámetros.

Suma: 14

NB: Cuando un ejercicio describe un método que supuso devolver algo, esto significa que el tipo de valor de 
retorno debe ser declarado en el método de definición, y que el método contiene un returnEso devuelve los datos 
deseados. El método no imprimirá nada. no usará el comando System.out.println- esa es una tarea que queda 
en el método que llama, que en este caso es el programa principal.

*/