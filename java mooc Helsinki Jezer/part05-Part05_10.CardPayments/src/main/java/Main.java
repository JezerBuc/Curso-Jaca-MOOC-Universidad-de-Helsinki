
public class Main {

    public static void main(String[] args) {
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }//main
}//clase Main

/*
Salida de la muestra

dinero: 1000.0, número de comidas afforables vendidas: 0, número de comidas abundantes vendidas: 0
cantidad de dinero en la tarjeta es de 2,0 euros
Había suficiente dinero: falso
Había un dinero: verdad
cantidad de dinero en la tarjeta es de 97,7 euros
dinero: 1100.0, número de comidas aforables vendidas: 0, número de comidas abundantes vendidas: 1

*/

