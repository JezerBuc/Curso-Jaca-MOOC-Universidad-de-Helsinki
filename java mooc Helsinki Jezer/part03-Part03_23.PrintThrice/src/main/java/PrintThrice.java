
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a word");
        String word = scanner.nextLine();
        String words = word+word+word;
        System.out.println(words);
        
        
        scanner.close();


    }//main
    
    /*
    
    *Don't use a loop here*
    
    Give a word: cake

    cakecakecake
    
    */
}//class
