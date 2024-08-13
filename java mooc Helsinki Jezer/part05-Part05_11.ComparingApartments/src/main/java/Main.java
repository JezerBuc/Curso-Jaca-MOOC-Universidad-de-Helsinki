
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        Apartment casaEstudio = new Apartment(1, 20, 1000);
        Apartment casaFrankLloyd =new Apartment(2, 23, 1500);
        Apartment casaLuisBarragan = new Apartment(5, 65, 19822);
        
        
        System.out.println(casaEstudio.largerThan(casaFrankLloyd));
        System.out.println(casaFrankLloyd.priceDifference(casaLuisBarragan));
        System.out.println(casaEstudio.moreExpensiveThan(casaLuisBarragan));
        
        System.out.println("=========*******=========");
        System.out.println(casaEstudio.priceApartament());
        System.out.println(casaFrankLloyd.priceApartament());
                
        
        
        //price diference
        //moreExpensive

  
    }//main
}//clase Main
