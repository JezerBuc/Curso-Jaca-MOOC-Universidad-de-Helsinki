

public class Agent {

    private String firstName;
    private String lastName;
    
    public Agent(String initFirstName, String initLastName) {
        this.firstName = initFirstName;
        this.lastName = initLastName;
    }//constructor
    
    @Override
    public String toString(){
        return "My name is " + this.lastName+ ", "
                + this.firstName + " " + this.lastName;       
    }//to String
 
}//clase Agente 

/*
La plantilla de ejercicio define una clase de Agente, con nombre y apellido. 
A printmétodo se define para la clase que crea la siguiente 
representación de cuerda.

Agent bond = new Agent("James", "Bond");
bond.print();

Salida de la muestra

My name is Bond, James Bond

Quitar la clase ' printmétodo, y crear un public String toString()método para ella, 
que devuelve la representación de cuerda mostra mostrada anteriormente.

*/
