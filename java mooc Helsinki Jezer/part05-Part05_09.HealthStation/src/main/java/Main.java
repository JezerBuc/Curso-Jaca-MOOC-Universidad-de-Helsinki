
public class Main {

    public static void main(String[] args) {
        
        HealthStation hospAdultosMayores = new HealthStation();
        
        Person juan = new Person("Juan", 68, 190, 80);
        Person victoria = new Person("Victoria", 88, 168, 60);
        
        System.out.println(juan.getName() + "'s weight: " + hospAdultosMayores.weigh(juan)+ " kilos");
        System.out.println(victoria.getName() + "'s weight: "+ hospAdultosMayores.weigh(victoria) + " kilos");
        
        hospAdultosMayores.feed(juan);
        hospAdultosMayores.feed(victoria);
        hospAdultosMayores.feed(victoria);
        hospAdultosMayores.feed(victoria);
        
        System.out.println(juan.getName() + "'s weight: " + hospAdultosMayores.weigh(juan)+ " kilos");
        System.out.println(victoria.getName() + "'s weight: " + hospAdultosMayores.weigh(victoria)+ " kilos");

        System.out.println("weighings performed: " + hospAdultosMayores.weighings());
    }
}
