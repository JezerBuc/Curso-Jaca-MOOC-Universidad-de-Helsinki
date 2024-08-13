
import java.util.ArrayList;

public class IoobProgram {

    public static void main(String[] args) {
        // Modify this program to cause an indexOutOfBoundsException 

        ArrayList<String> lines = new ArrayList<>();
        
        lines.add("Never has a man influenced physics so profoundly as Niels Bohr in the early 1900's");
        lines.add("Going back to this time period, little was known about atomic structure; Bohr set out");
        lines.add("to end the obscurity of physics. However, things didn't come easy for Bohr. He had to");
        lines.add("give up most of his life for physics and research of many hypothesis. But, this is why");
        lines.add("you and I have even heard of the quantum theory and atomic structures. Bohr came");
        lines.add("up with his quantum theory while studying...");
        
        lines.get(10);
        
        for (String line : lines) {
     
            System.out.println(line);
        }//for
  
        
        /*
        Una lista es extremadamente 
        útil para almacenar los valores de las variables para su uso posterior. Dicho esto, 
        cometer errores también es relativamente fácil con una lista.
        En la plantilla de ejercicios hay un programa que utiliza una lista. 
        Modifíquelo para que su ejecución produzca siempre el error IndexOutOfBounds. 
        El usuario no debería tener que dar ninguna entrada al programa (por ejemplo, escribir algo en el teclado).
        También puedes ver un medio para recorrer los valores de una lista - volveremos a este tema un poco más adelante.

       
        */

    }//main
    
}//class IoobProgram
