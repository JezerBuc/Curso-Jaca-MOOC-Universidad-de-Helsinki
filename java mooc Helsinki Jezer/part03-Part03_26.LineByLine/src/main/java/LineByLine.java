
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            
            String[] separar = input.split(" ");
            if(input.equals("")){
                break;
            }else {
                for(int i=0; i<separar.length; i++){
                    System.out.println(separar[i]);
                }//for
                }//else  
        }//while
    }//mian
}//class

/*
Escriba un programa que lea las cadenas del usuario. Si la entrada está vacía, 
el programa deja de leer y la entrada se detiene. Porque este es el de entrada no 
vacía que divide la entrada de cuerda por espacios blancos  e imprime cada parte de la cadena en una nueva línea.

"una vez"
Una vez
el sol
a
Tiempo
"un pequeño programa"


a
Pequita
programa
"parado"
parado
*/
