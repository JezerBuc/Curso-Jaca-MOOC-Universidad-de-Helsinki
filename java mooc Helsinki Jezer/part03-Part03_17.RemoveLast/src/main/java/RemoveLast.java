
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }//main
    
    public static void removeLast(ArrayList<String> strings){
        
    if(strings.size()==0){
        return;
        
    }else {
        strings.remove(strings.size()-1);
    }
    
    }//removeLast
    
    /*
    El método debe eliminar el último valor de la lista que recibe como parámetro. 
    Si la lista está vacía, el método no hace nada.

    ArrayList<String> strings = new ArrayList<>();

    strings.add("First");
    strings.add("Second");
    strings.add("Third");

    System.out.println(strings);

    removeLast(strings);
    removeLast(strings);

    System.out.println(strings);

    Salida de la muestra
    [Primero, segundo, tercero]
    [Primero]
    */

}//class
