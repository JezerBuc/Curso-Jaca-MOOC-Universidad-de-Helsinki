
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        while(true){
            String input = scanner.nextLine();
            String [] separar = input.split(" ");
            if (input.equals("")){
                break;
                
            }else {
                for(int i=0; i<separar.length; i++){
                    if(i<1){
                        System.out.println(separar[0]);
                        
                    }//if
                    
                }//for
                
            }//else
            
            
        }//while


    }//main
    
}//class


