
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> coleccionDeInfo = new ArrayList<>();
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Name: ");
            String nombre = scan.nextLine();
            
            if((nombre.isEmpty())){
                break;  
            }//if
            System.out.println("Last name: ");
            String apellido = scan.nextLine();
           
            System.out.println("Identification number: ");
            String numIdentificacion = scan.nextLine();
            
            coleccionDeInfo.add(new PersonalInformation(nombre, apellido, numIdentificacion));
            
        }//while
        
       for(PersonalInformation coleccion : coleccionDeInfo){
           System.out.println(coleccion.getFirstName()+ " "+coleccion.getLastName());
           
       }//for


    }//main
}//PersonalInformationCollection

/*
            
            */

/*
First name: Jean
Last name: Bartik
Identification number: 271224
First name: Betty
Last name: Holberton
Identification number: 070317
First name:

Jean Bartik
Betty Holberton

*/