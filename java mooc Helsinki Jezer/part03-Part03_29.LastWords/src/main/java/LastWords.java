
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            String [] separar = input.split(" ");
            
            if(input.equals("")){
                break;
            }else {
                for(int i=0; i<separar.length; i++){       
                    if(i==separar.length-1){
                        System.out.println(separar[i]);
                    }//if
        
                }//for
                
                
            }//if else
            
            
        }


    }//main
}//class
