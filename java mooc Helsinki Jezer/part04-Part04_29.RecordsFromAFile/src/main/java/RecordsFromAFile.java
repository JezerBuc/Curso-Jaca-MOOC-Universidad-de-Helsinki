
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String file = scanner.nextLine();
        
        try (Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String fila = sc.nextLine();
                String [] partesSplit = fila.split(",");
                String nombre = partesSplit[0];
                int edad = Integer.valueOf(partesSplit[1]);
                System.out.println(nombre+", "+ "age: " + edad + " years");              
            }//while
            
        }catch(Exception e){
            System.out.println("Error: "+ e.getCause());
            
        }

    }//main
}//clase 

/*
Trabajaremos con archivos almacenados en formato CSV que contienen nombres y edades separados por comas. El archivo puede verse así:
Datos de la muestra

Lily,3
antton,5
Levi,4
Amy,1

Su tarea es escribir un programa que primero anime al usuario para el nombre del archivo que desea leer. 
El programa luego imprime el contenido del archivo de la siguiente manera 
(estamos suponiendo que la salida es del archivo mencionado anteriormente).
Salida de la muestra

Nombre del expediente:
data.txt
Lily, edad: 3 años
antton, edad: 5 años
rebanadas, edad: 4 años
amy, edad: 1 año

NB. La palabra "año" debe ser formateada en la edad.



Name of the file:
data.txt
lily, age: 3 years
anton, age: 5 years
levi, age: 4 years
amy, age: 1 year

NB! The word "year" should be formatted based on the age.
*/
