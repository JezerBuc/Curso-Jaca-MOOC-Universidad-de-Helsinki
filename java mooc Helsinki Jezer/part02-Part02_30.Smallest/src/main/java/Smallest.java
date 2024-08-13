
public class Smallest {

    public static int smallest(int number1, int number2) {
        if(number1<number2){
            return number1;
            
        }else {
            return number2;
        }
 
        
    }//metodo smallest
    
    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }//main
    /*
    public static void main(String[] args) {
        int resultado = smallest(10, 3);
        System.out.println("Smallest:" + resultado);
    }
    */
    
    
}//class smallest


/*
Definir un método de dos parámetros smallestDevuelve el menor número de los dos números pasados como un curso.

public static int smallest(int number1, int number2) {
    // write your code here
    // do not print anything inside the method

    // there must be a return command at the end
}

public static void main(String[] args) {
    int answer =  smallest(2, 7);
    System.out.println("Smallest: " + answer);
}

La salida del programa:
Salida de la muestra

Más pequeño: 2

*/