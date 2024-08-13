
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //promedio de una lista de numeros
        
        ArrayList<Integer>list = new ArrayList<>();
        int cont =0;
        int suma=0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
            break;
            }//if
            list.add(input);
        }//while
        
        
            for(int number : list){
                suma = suma + number;
                cont++;
            }//for
        
        
        double avg = (double)suma/cont;
        
        System.out.println("Average: " + avg);
        
        
        /*
        Cuando la lectura termina, calcásee el promedio de los números en él, y luego imprilas ese valor.
        Salida de la muestra

        72
        2
        8
        11
        -1

        Media: 23.25
        
        */
    }//main
}//class

/*
        for (int i=0; i<list.size(); i++){
            cont = cont + cont;
            for(int number : list){
                suma = suma + number;
            }//for
        }//for

*/