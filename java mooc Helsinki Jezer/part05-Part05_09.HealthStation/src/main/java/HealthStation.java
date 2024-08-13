
public class HealthStation {
    private int countWeighings;


    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        countWeighings++;
        return person.getWeight();
        
    }//metodo weight (persona person)
    
    public void feed(Person person){
        person.setWeight(person.getWeight()+1);
        
        
    }//método recibe un objeto de tipo Person como parámetro e incrementar el peso de la persona en uno.
    
    public int weighings(){
        return countWeighings;

    }//método debe retornar la cantidad de veces que la estación de salud ha realizado pesajes.

}//clase HealtStation

/*
Pesaje de personas:

Completa el método weigh en la clase HealthStation. 
Este método recibe un objeto de tipo Person como parámetro
y debe retornar su peso. El peso se puede obtener llamando 
a un método adecuado del objeto Person.


Alimentar personas:

Escribe un método llamado feed en la clase HealthStation. 
Este método recibe un objeto de tipo Person como parámetro 
y debe incrementar el peso de la persona en uno.


Contar los pesajes:

Crea un nuevo método llamado weighings en la clase 
HealthStation. Este método debe retornar la cantidad de 
veces que la estación de salud ha realizado pesajes.
Necesitarás una nueva variable de instancia para contar 
el número de pesajes realizados.

Los ejemplos de programas principales proporcionados te
muestran cómo se deben usar estos métodos y el resultado 
esperado tras su ejecución.

Recuerda que no debes modificar la clase Person. 
Solo debes trabajar en la clase HealthStation para 
completar los métodos solicitados.

The output is:
Sample output

weighings performed: 0
weighings performed: 2
weighings performed: 6



Salida de la muestra

pesas realizadas: 0
pesas realizadas: 2
pesas realizadas: 6

*/

