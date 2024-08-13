import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        while(true){
            
            System.out.println("Name: ");
            String name = scan.nextLine();
            if(name.isEmpty()){
                break;
            }
            
            System.out.println("Duration: ");
            int duracion = Integer.valueOf(scan.nextLine());
            
            programas.add(new TelevisionProgram(name, duracion));
        }//while
        
        System.out.println("Program's maximum duration? ");
            int max = Integer.valueOf(scan.nextLine());
        for(TelevisionProgram programa : programas){
           
                if (programa.getDuration()<=max){
            
                        System.out.println(programa);         
                }     
        }//for

    }//main
}//clase Main


/*

Program's maximum duration? 30
Rick and Morty, 25 minutes
Two and a Half Men, 30 minutes


Salida de la muestra

Nombre: Rick y Morty
Duración: 25
Nombre: Dos hombres y medio
Duración: 30
Me encanta o enumeralo
Duración: 60
Nombre: Casa
Duración: 60

La duración máxima del programa? 30
Rick y Morty, 25 minutos
Dos hombres y medio, 30 minutos

*/