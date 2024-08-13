
public class SumOfArray {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }//main

    public static int sumOfNumbersInArray(int[] array) {
        int suma =0;
        
        for(int i=0; i<array.length; i++){
            suma = suma + array[i];

        }//for
        return suma;
    }//sumOfNumbersInArray
    
    /*
    Completa el método que calcula y devuelve las cantidades en el array que recibe como parámetro.

    Puedes probar el cómputo de la suma con este ejemplo:

    int[] numbers = {5, 1, 3, 4, 2};
    sumOfNumbersInArray(numbers);

    Salida de la muestra

    15
    */
}//class
