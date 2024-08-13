
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int caracteres = 0;
        int cont = 0;
        int year = 0;
        int numYears = 0;
        int suma = 0;
        double avg = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }//if
            String[] sp = input.split(",");
            caracteres = Integer.valueOf(sp[0].length());
            if (caracteres > cont) {
                cont = caracteres;
                name = sp[0];
            }//if
            year = Integer.valueOf(sp[1]);
            for (int i = 0; i < sp.length; i++) {
                suma = suma + year;
                numYears++;
            }//for
        }//while
        avg = (double) suma / numYears;
        System.out.println("Longest name:  " + name);
        System.out.println("Average of the birth years:" + avg);
    }//main
}//class
/*


Después de eso el programa imprime el nombre más largo y el promedio de los años de nacimiento. 
Si varios nombres son igualmente más largos, puede imprimir cualquiera de ellos. Puedes asumir que 
el usuario entra al menos en una persona.
Salida de la muestra

sebastian,2017
lucas,2017
Lily,2017
Hanna, 2014
gabriel,2009

Nombre más largo: sebastian
Promedio de los años de nacimiento: 2014.8
*/