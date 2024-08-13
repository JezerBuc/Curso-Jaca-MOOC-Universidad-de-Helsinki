//esta mal no paso ningun test
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        
        boolean numsImpresos = false;
        
        for(int i=num; i<=100; i++){
            if (i >-2 && i<98){
                   if (!numsImpresos) {
                    System.out.println("many numbers");
                    numsImpresos = true;
                
            }
            else{
                System.out.println(i);
            }
            
        }
        
        
        }//for
    }//main
}//class


/*
Escriba un programa, que lee un número entero del usuario.
Luego el programa imprime de ese número al 100. Puedes asumir que el usuario siempre da un número menos de 100. 
A continuación se presentan algunos ejemplos de la funcionalidad esperada.
Salida de la muestra

99
99
100
Salida de la muestra

- 4
- 4
-3
-2
-1
0
1
2
... (muy números en el medio) ...
98
99
100


*/