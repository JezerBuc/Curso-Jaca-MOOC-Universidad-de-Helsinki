
public class Person {

    private String name;
    private Pet pet;

    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }//constructor persona (nombre, mascota)

    public Person(String name) {
        this(name, new Pet("Toothless", "dragon"));
    }//constructor person (nombre(mascota por default) )

    public Person() {
        this("Lilo", new Pet("Stitch", "blue alien"));
    }//contructor ((nombre default)(mascota default))

    @Override
    public String toString() {
        return this.name + ", has a friend called " + pet.getName()
                +" (" + pet.getBreed()+ ")";
    }//toString

}//clase Person
