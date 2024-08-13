
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }//constructor
    
    public int getMtsCuadrados(){
        return this.squares;
    }//get mts cuadrados
    
    public boolean largerThan(Apartment comparado){
        if(this.squares> comparado.getMtsCuadrados()){
            return true;
        }else{
            return false;           
        }//else 
    }//mas grande que
    
    public int priceApartament(){
        return this.squares * this.princePerSquare;   
    }//priceApartament
    

    public int priceDifference(Apartment comparar){
        int precioActual = this.priceApartament();
        int apartamentoPrice = comparar.priceApartament();
        if(precioActual>apartamentoPrice){
            return precioActual - apartamentoPrice ;      
        }else{
            return apartamentoPrice - precioActual;
        }//else

        }//price Diference
    
    public boolean moreExpensiveThan(Apartment comparar) {
        if (this.priceApartament() > comparar.priceApartament()) {
            return true;
        } else {
            return false;
        }//else
    }//es Más caro que...

}//class apartament

/*

Cree un método public boolean largerThan(Apartamento comparado) que devuelva true si el objeto apartamento cuyo método 
es llamado tiene un área total mayor que el objeto apartamento que se está comparando.

Cree un método public int diferenciaDePrecios(ApartamentoComparado) que devuelva la diferencia de precios del objeto
apartamento cuyo método fue llamado y el objeto apartamento recibido como parámetro. La diferencia de precio es el 
valor absoluto de la diferencia de los precios (el precio se puede calcular multiplicando el precio por plaza por el 
número de plazas).

Escriba un método public boolean moreExpensiveThan(Apartamento comparado) que devuelva true si el objeto 
apartamento cuyo método se llama es más caro que el objeto apartamento comparado.


*/
