
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del regalo: ");
        double valor = Double.valueOf(scan.nextLine());
        double impuesto = 0;
        
        if (valor >= 1000000) {
            impuesto = 142100 + (valor - 1000000) * 0.17;
        } else if (valor >= 200000) {
            impuesto = 22100 + (valor - 200000) * 0.15;
        } else if (valor >= 55000) {
            impuesto = 4700 + (valor - 55000) * 0.12;
        } else if (valor >= 25000) {
            impuesto = 1700 + (valor - 25000) * 0.10;
        } else if (valor >= 5000) {
            impuesto = 100 + (valor - 5000) * 0.08;
        } else {
            System.out.println("El valor del regalo es menor que el límite mínimo de 5,000 euros, por lo que no se debe pagar impuesto.");
            scan.close();
            return;
        }
        
        System.out.println("Impuesto = " + impuesto);
        scan.close();


            
            
    }
}

