
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jbuc_
 */
public class NumerosEnUnArchivo {
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nombre del archivo?");
        String nombreArchivo = scan.nextLine();
        
        System.out.println("Limite inferior?");
        int limInferior = Integer.valueOf(scan.nextLine());
        
        System.out.println("Limite Superior");
        int limSuperior = Integer.valueOf(scan.nextLine());
        
        
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(nombreArchivo))){
            while(sc.hasNextLine()){
                int fila = Integer.valueOf(sc.nextLine());
                if(fila <= limSuperior && fila >= limInferior){
                    listaNumeros.add(fila);   
                    System.out.println(fila);
                }//if
                
            }//while
            
          
            
        }catch(Exception e){
            System.out.println("Error; " + e.getMessage());
        }//catch
        

        
    }//main
    
}//clase NumerosEnUnArchivo

/*

Escriba un programa que ansita al usuario por un nombre de archivo, así como los límites superior e inferior para el rango de números aceptado.
A continuación, el programa lee los números contenidos en el archivo (cada número está en su propia línea) y sólo explica los números que están por debajo del rango. 
Finalmente, el programa debe imprimir el número de números que estaban dentro del rango dado.

Usted convierte puede un número entero tipo cadena de un archivo a un número entero apropiado usando 
el comando Integer.valueOf(justo en cuanto a la manipulación de un usuario).
File? numbers-1.txt
Lower bound? 15
Upper bound? 20
Numbers: 2

*/
