
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
        }//main
    public static int sum(ArrayList<Integer> numbers) {
        
        int suma = 0;
        
        for (int num: numbers){
            
            suma = num + suma;
            
        }//for
        
        return suma;
    }//sum
    
    }// class sum
    
    
    
    
    
   



 /*
    El método es devolver las cantidades en la lista de parámetros.

    

    Salida de la muestra

    10
    16
    
    */
