/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balanceInicial){
        this.balance = balanceInicial;
    }//constructor
    
    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.6;
        }//if

    }//metodo descontar 2.6 Euros

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }//if

    }//metodo descuenta 4.6 euros
    
    public void addMoney(double money) {
        if (money > 0) {
            this.balance += money;
        }//if
        if ((this.balance+money)>150){
            this.balance = 150;
        }//if
    }//metodo agregarDinero
    
    public String toString(){
        return "The card has a balance of "+this.balance + " euros";
    }//toString
    
}//clase PaymentCard


/*

Paul: The card has a balance of 15.4 euros
Matt: The card has a balance of 27.4 euros
Paul: The card has a balance of 35.4 euros
Matt: The card has a balance of 22.799999999999997 euros
Paul: The card has a balance of 30.199999999999996 euros
Matt: The card has a balance of 72.8 euros

Salida de la muestra

Paul: La Tarjeta tiene un saldo de 15,4 euros
Matt: La tarjeta tiene un saldo de 27,4 euros
Paul: La Tarjeta tiene un saldo de 35,4 euros
Matt: La tarjeta tiene un saldo de 227999999999999999999999999997 euros
Paul: La tarjeta tiene un saldo de 30.19999999999999996 euros
Matt: La tarjeta tiene un saldo de 72,8 euros
*/