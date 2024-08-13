
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        buscarArchivo(input);
        
    }//main
    
    public static void buscarArchivo (String nombreArchivo){
        
        try(Scanner sc = new Scanner(Paths.get(nombreArchivo))){
            while(sc.hasNextLine()){
                String fila = sc.nextLine();
            System.out.println(fila);   
            }//while   
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }//catch
        
    }//metodo buscargar archivo
    
}//clase print archivo especifico

/*
Escriba un programa que le pida al usuario una cadena, y luego 
imprime el contenido de un archivo con un nombre que coinja con 
la cadena proporcionada. Usted puede asumir que el usuario 
proporciona un nombre de archivo que el programa puede encontrar.

Which file should have its contents printed?
song.txt

La plantilla de ejercicio contiene los archivos "data.txt" 
y "song.txt", que puede utilizar para probar cuando la 
funcionalidad de su programa. La salida del programa se puede 
ver a continuación cuando un usuario ha entrado en la 
cadena "song.txt". El contenido que se imprime en el 
archivo "song.txt". Naturalmente, el programa también 
debe trabajar con otros nombres de archivo, para ser encontrado.

*/
