
import java.util.Scanner;


public class MainProgram {

    public static void main(String[] args) {
        

        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard matiasCard = new PaymentCard(30);
        
        paulCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        
        matiasCard.eatAffordably();
        System.out.println("Matt: " + matiasCard);
        
        paulCard.addMoney(20);
        System.out.println("Paul: " + paulCard);
        
        matiasCard.eatHeartily();
        System.out.println("Matt: " + matiasCard);
        
        paulCard.eatHeartily();
        System.out.println("Paul: " + paulCard);
        
        matiasCard.addMoney(50);
        System.out.println("Matt: " + matiasCard);
        
        


    }//main
}//Clase Main

        