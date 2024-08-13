
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;

        try ( Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                String fila = sc.nextLine();
                if (fila.equals(searchedFor)) {
                    isFound = true;
                }//if
            }//while

            if (isFound) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }//if

        } catch (Exception e) {
            System.out.println("Reading the file " + file + "filed");
        }//catch


        //System.out.println("Found!");
        //System.out.println("Not found.");
        

    }//main
}//clase estaEnElArchivo

/*

La plantilla de ejercicio viene con dos archivos. names.txtY other-names.txt. 
Escriba un programa que primero pida al usuario que se lea el nombre del archivo, que después de que el usuario es
impulsado por la cadena que está buscando. A continuación, el programa lee y busca la cuerda deseada.

Si se encuentra la cuerda, el programa debe imprimirse. Si no, el programa debe imprimir "No se encuentra". 
Si la lectura de los fallos (la lectura termina en un error) el programa debe imprimir el mensaje "Leer el archivo ""file" "rechazar".
Salida de la muestra

Nombre del expediente:
names.txt
Búsqueda de:
Antti
No encontrado.
*/
