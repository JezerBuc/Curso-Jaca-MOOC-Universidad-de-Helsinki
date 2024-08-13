
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }//constructor

    public String getName() {
        return name;
    }//getName

    public int getAge() {
        return age;
    }//getAge

    @Override
    public String toString() {
        return this.name + ", age: " + this.age;
    }//toString

}//clase Person
