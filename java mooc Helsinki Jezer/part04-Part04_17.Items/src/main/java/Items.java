
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        ArrayList<Item> listaDeItems = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        
        while(true){
            String input = scan.nextLine();
            if(input.isEmpty()){
                break;
            }
            listaDeItems.add(new Item(input));
            System.out.println("");
        }//while
        
        for(Item list: listaDeItems){
            System.out.println("Name: " + list);
        }
        
        

    }//main
}//clase Items

/*

Name: Hammer
Name: Collar
Name:

Hammer (created at: 06.07.2018 12:34:56)
Collar (created at: 06.07.2018 12:34:57)

Implementar la clase Items- Toma. - NB. No modifique la clase 
Item.

Escriba un programa que lea nombres de elementos del usuario. 
Si el nombre está vacío, el programa deja de leer.
El nombre dado se utiliza para crear un nuevo elemento, que 
luego agregará itemsLista.

**Reserva todos los nombres, imprime todos los elementos 
usando el toStringmétodo de la Itemclase.**
A continuación se da un ejemplo del programa de trabajo:

*/
