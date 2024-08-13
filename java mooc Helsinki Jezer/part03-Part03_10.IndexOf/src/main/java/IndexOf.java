
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }//if

            list.add(input);
        }//while

        System.out.println("Search for?");        
        
        int buscarNumero = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i<list.size(); i++){
            if(buscarNumero == list.get(i) ){
                System.out.println(buscarNumero + "is at index " + i);
                
            }//if 
        }//for
     
        
         
        
        
        
         //System.out.println(num + " Esta en el indice " + indice);

        // implement here finding the indices of a number
    }//main
    
    /*
    
    */
}//class indexOf
