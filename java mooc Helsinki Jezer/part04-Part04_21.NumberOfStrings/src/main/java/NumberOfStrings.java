
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> cadenas = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            if(input.contains("end")){
                break;
            }//if
            cadenas.add(input);
            
        }//while
        
        System.out.println(cadenas.size());
        
 

    }//main
}//clase everything

/*
Escriba un programa que lea las cadenas del usuario hasta 
que el usuario introte la cadena "end". En ese momento, 
el programa debería imprimir cuántas cuerdas se han leído.
El "fin" de la cadena no debe incluirse en el número de cuerdas 
que se lee. Puedes encontrar algunos ejemplos a continuación 
de cómo funciona el programa.
Salida de la muestra

Yo
tienen
a
sensación de
Eso
Yo
tienen
Escrito
Esto
equivocadas
antes de
end
11

end
0
*/
