/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class Debt {
    private double balance;
    private double interes;
    
    public Debt(double balanceInicial, double interesInicical){
        this.balance = balanceInicial;
        this.interes = interesInicical;
    }//constructor
    
    
    public void printBalance(){
        System.out.println(balance);
        
    }//metodo imprimir Deuda
    
    public void  waitOneYear(){
       this.balance *= interes;
        
    }//metodo esperar un Año
    
}//clase Debt


/*
Crear la clase Debt que tiene variables de instancia de doble 
tipo de balanceY interestRate. El saldo y el tipo de interés 
se pasan al constructor como parámetros 
public Debt(double initialBalance, double initialInterestRate).

Además, crear los métodos public void printBalance()Y 
public void waitOneYear()para la clase. El método 
de printBalance imprime el saldo actual, y 
el método waitOneYear crece la cantidad de deuda.

La deuda se incrementa multiplicando el saldo por 
la tasa de interés.

La clase hace lo siguiente:
Prints:
Sample output

120000.0
121200.0
147887.0328416936


Cuando haya logrado que el programa funcione, compruebe 
el ejemplo anterior con las tasas de interés de 
principios de 1900.

Una vez que consigas que el programa funcione, prueba 
el ejemplo anterior con las tasas de interés de 
las recesiones de principios de la década de 1990 
cuando las tasas de interés eran tan altas 
como 15-20% - prueba la tasa de interés en lo anterior 
con el ejemplo 1.20y ver qué pasa.

*/
