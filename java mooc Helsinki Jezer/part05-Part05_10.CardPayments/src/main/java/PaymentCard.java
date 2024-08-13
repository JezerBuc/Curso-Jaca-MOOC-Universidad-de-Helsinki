
public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }//contructor (balance)

    public double balance() {
        return this.balance;
    }//return balance

    public void addMoney(double increase) {
        this.balance += increase;
    }//addMoney

    public boolean takeMoney(double amount) {
        if (balance >= amount){
            balance = balance - amount;
            return true; 
        }else {
            return false;
        }//else
   
        
    }//retirar el dinero 
}//class payment card 


/*
Pasos del Ejercicio

Implementar takeMoney(double amount) en PaymentCard:
Solo disminuir el saldo si es suficiente y devolver true o false.



Uso de PaymentCard:

Imprimir el saldo inicial, después de un retiro exitoso y de un retiro fallido.
Uso de PaymentTerminal con efectivo:

Procesar pagos en efectivo y mostrar el cambio restante y el estado del terminal.
Uso de PaymentTerminal con tarjeta:

Procesar pagos con tarjeta y mostrar si la operación fue exitosa y el estado del terminal.
Añadir dinero a la tarjeta:

Mostrar el saldo de la tarjeta antes y después de añadir dinero, y el estado del terminal.
En resumen, el ejercicio busca enseñar cómo separar responsabilidades entre diferentes clases para mantener un diseño más flexible y manejable.



///////////////
Detalles Clave
PaymentCard:

Implementar takeMoney(double amount) para que solo retire dinero si el saldo es suficiente,
devolviendo true o false según si la operación fue exitosa.
PaymentTerminal:

Inicializar con 1000 euros en efectivo.

Métodos eatAffordably y eatHeartily para procesar pagos en efectivo, 
devolviendo el cambio si el pago es suficiente.

Métodos eatAffordably(PaymentCard card) y eatHeartily(PaymentCard card) 
para procesar pagos con tarjeta, devolviendo true o false según si la 
tarjeta tiene suficiente saldo.

addMoneyToCard(PaymentCard card, double sum) para añadir dinero a 
la tarjeta y aumentar el efectivo en el terminal.



*/
