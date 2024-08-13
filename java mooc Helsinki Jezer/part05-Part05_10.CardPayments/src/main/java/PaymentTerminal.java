
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }//constructor 

    public double eatAffordably(double payment) {
        double cost = 2.50;
        if (payment>=cost){
            this.money = this.money+cost;
            this.affordableMeals++;
            return payment - cost;
            
        }else {
            return payment;
        }
        
    }//comer de forma accesible/economica (payment)

    public double eatHeartily(double payment) {
        double cost = 4.30;
        if (payment >= cost){
            this.money+= cost;
            this.heartyMeals++;
            return payment -cost;
        }else{
            return payment;
        }
    }//comer agusto
    
   public boolean eatAffordably(PaymentCard card) {
        double cost = 2.50;
        if (card.takeMoney(cost)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        double cost = 4.30;
        if (card.takeMoney(cost)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }
    
    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum>0){
            card.addMoney(sum);
            this.money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}//clase payment Terminal 

/*
Implementar PaymentTerminal:

Métodos para pagos en efectivo (eatAffordably, eatHeartily).
Métodos para pagos con tarjeta 
(eatAffordably(PaymentCard card), eatHeartily(PaymentCard card)).

Método para añadir dinero a la tarjeta (addMoneyToCard).


Métodos eatAffordably y eatHeartily para procesar pagos en efectivo, 
devolviendo el cambio si el pago es suficiente.

Métodos eatAffordably(PaymentCard card) y eatHeartily(PaymentCard card) 
para procesar pagos con tarjeta, devolviendo true o false según si la 
tarjeta tiene suficiente saldo.
*/
