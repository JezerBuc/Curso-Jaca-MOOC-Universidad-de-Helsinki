
import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String word = scanner.nextLine();
        
        if(word.equals("true")){
            System.out.println("You got it right!");
        }else {
            System.out.println("Try again!");
        }//if else

    }//main
    
    /*
    Escriba un programa que le pida al usuario una cadena. Si el usuario escribe 
    la cadena "verda", el programa imprime "Lo tienes bien".Si escribe otra cosa imprime "Try again!"
    
    Write a program that asks the user for a string. If the user writes the string "true", the program 
    prints "You got it right!", otherwise it prints "Try again!".
    Give a string: true
    You got it right!
    Sample output

    Give a string: trueish
    Try again!
    
    */
}//class
