
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        if(number1>number2 && number1>number3){
            return number1;
        }else if (number2>number1 && number2>number3){
            return number2;
        }else{
            return number3;
        }

        
    }//metodo greatest

    public static void main(String[] args) {
        int result = greatest(2, 7, 23);
        System.out.println("Greatest: " + result);
    }//main
    
}//class greatest

/*
Definir un método llamado greatestEso lleva tres números y devuelve el más grande de ellos. 
Si hay múltiples valores más grandes, devolver uno de ellos es suficiente.
La impresión tendrá lugar en el programa principal.

public static int greatest(int number1, int number2, int number3) {
  // write some code here
}

public static void main(String[] args) {
  int answer =  greatest(2, 7, 3);
  System.out.println("Greatest: " + answer);
}

La salida del programa:
Salida de la muestra

Mayor: 7

*/