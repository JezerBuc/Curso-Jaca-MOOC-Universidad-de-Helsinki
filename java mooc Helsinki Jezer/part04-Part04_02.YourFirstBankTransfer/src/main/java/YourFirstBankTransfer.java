
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account accountMatt = new Account("Matthews account",1000);
        Account myAccount = new Account("My account", 0);
        accountMatt.withdrawal(100);
        myAccount.deposit(100);
        
        System.out.println(accountMatt);
        System.out.println(myAccount);
        
    }//main
}//class

/*

Escriba un programa que:

    Crea un nombre de cuenta "Matthews account"con el saldo 1000
    Crea un nombre de cuenta "My account"con el saldo 0
    Retira 100.0 de la cuenta de Mateo
    Depósitos 100.0 a "mi cuenta"
    Imprime las cuentas


*/