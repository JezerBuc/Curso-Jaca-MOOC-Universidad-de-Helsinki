
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        
        String nombre="";
        int edad = 0;
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String fila = sc.nextLine();
                
                String [] sp = fila.split(",");
                nombre=sp[0];
                edad=Integer.valueOf(sp[1]);
                persons.add(new Person(nombre,edad));
                
            }//while
            
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
            
        }


        return persons;

    }
}

/*
Trabajaremos con archivos almacenados en formato CSV, que contienen nombres y edades separados por comas. El archivo puede verse así:
Datos de la muestra

data.txt

Lily,3
antton,5
Levi,4
Amy,1

La plantilla de ejercicios ya tiene una Personclase, y la clase 
StoringRecordsTiene un cuerpo para el método public static 
ArrayList<Person> readRecordsFromFile(String file). 

Implementar la readRecordsFromFilemétodo que lee las personas 
del archivo pasado como parámetro, y finalmente devuelve en la
lista del método.

La plantilla de ejercicio tiene una mainmétodo que puede 
utilizar para probar funciona su programa. En este ejercicio, 
sólo modifica el método readRecordsFromFile.

*/
