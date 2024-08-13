
public class Main {

    public static void main(String[] args) {
        //Test your Debt class here
        Debt cuentaMortgage = new Debt(120000.0, 1.01);
        cuentaMortgage.printBalance();

        cuentaMortgage.waitOneYear();
        cuentaMortgage.printBalance();
        
        for (int years = 0; years<20; years++){
            cuentaMortgage.waitOneYear();  
        }//for

        cuentaMortgage.printBalance();
    }
}
