
public class Product {

    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight) {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }//constructor
    
    public Product(String name){
        this(name, "shelf", 1);
    }//constructor (parametro nombre)
    
    public Product(String name,String location){
        this(name, location, 1);
    }//constructor (parametro nombre y bicaion)
    
    public Product(String name, int weight){
        this(name, "shelf", weight);
    }//constructor (parametro nombre y peso)
 
    public String getName() {
        return name;
    }//getName

    public int getWeight() {
        return weight;
    }//getWeight

    public String getLocation() {
        return location;
    }//getLocation

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }//toString
}//clase Product
