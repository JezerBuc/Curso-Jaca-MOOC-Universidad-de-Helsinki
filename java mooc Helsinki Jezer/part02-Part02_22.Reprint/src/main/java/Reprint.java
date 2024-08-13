
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        System.out.println("How many times?");
       
        // then call the printText-method multiple times with a while-loop
        
        Scanner scanner = new Scanner(System.in);
         
        int veces = Integer.valueOf(scanner.nextLine());
      

         for(int i=0; i<veces; i++){
             printText();
             
         }
        
    }
    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static void printText() {
        System.out.println("In a hole in the ground there lived a method");
        //System.out.println("En un agujero en el suelo vivía un método");
    }
}
