
public class Pet {

    private String name;
    private String breed;

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }//construtor mascota (nombre, raza)

    public String getName() {
        return name;
    }//getName mascota

    public String getBreed() {
        return breed;
    }//getRaza mascota

}//clase mascota
/*

Dos clases, PersonY Pet, se incluyen en la plantilla de ejercicio. 
Cada persona tiene una mascota. Modificar la public String
toStringmétodo de la PersonQue la cuerda que devuelve le dice 
al nombre y raza de la mascota en el propio nombre de la persona.

output:
Leo, has a friend called Lucy (golden retriever)
*/