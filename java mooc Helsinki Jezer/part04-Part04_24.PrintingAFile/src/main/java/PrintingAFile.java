
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(Paths.get("data.txt"))){
            while(scan.hasNextLine()){
                String fila = scan.nextLine();
                System.out.println(fila);
                
            }//while
            
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
            
        }//catch

    }//main
}//clase PrintingAfile

/*
Escriba un programa que imprima el contenido de 
un archivo llamado "data.txt", que es la línea
del archivo impreso en su propia línea.

*/


