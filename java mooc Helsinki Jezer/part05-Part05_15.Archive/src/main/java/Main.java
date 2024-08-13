
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Archive>lista = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String ident = scan.nextLine();
            
            if(ident.isEmpty()){
                break;
            }//if
            System.out.println("Name? (empty will stop)");
            String nombre = scan.nextLine();
            if(nombre.isEmpty()){
                break;
            }//if
            
            Archive arch = new Archive(ident, nombre);
            if (lista.contains(arch)){
                continue;
            }else{
                lista.add(arch);
            }           
            
        }//while
        
        for (Archive arch : lista){
            System.out.println("==Items==");
            System.out.println(arch);           
        }
    }//main
}//clase Main

/*
En este ejercicio se trata de implementar un programa que se puede utilizar para manejar un archivo. 
Se pueden añadir varios elementos. Cuando no se añaden más elementos, se imprimen todos los elementos del archivo.

Añadir y listar elementos

El programa debe leer los ítems del usuario. Cuando se han leído todos los ítems del usuario, 
el programa imprime la información de cada ítem.

Para cada elemento, se debe leer su identificador y su nombre. Si el identificador o el nombre están vacíos,
el programa deja de pedir datos e imprime toda la información del elemento.

Ejemplo de impresión:
Ejemplo de salida

Identifier? (empty will stop)
B07H8ND8HH
Name? (empty will stop)
He-Man figure
*/
