
import java.util.Objects;

public class Person {

    private String name;
    private SimpleDate birthday;
    private int height;
    private int weight;

    public Person(String name, SimpleDate birthday, int height, int weight) {
        this.name = name;
        this.birthday = birthday;
        this.height = height;
        this.weight = weight;
    }//constructor person

    @Override
    public boolean equals(Object comparar){
        if (this == comparar){
            return true;
        }
        if (!(comparar instanceof Person)){
            return false;
        }
        
        Person compPerson = (Person) comparar; 
        
        return this.name.equals(compPerson.name) &&
                this.birthday.equals(compPerson.birthday) &&
                this.height == compPerson.height &&
                this.weight == compPerson.weight;
        
    }//equals
}//clase Person
