
import java.util.ArrayList;
import java.util.Scanner;

public class ThirdElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println(list.get(2));
        
        
        //este ejemplo yo lo hice
        ArrayList<Integer> listaNumbers = new ArrayList<>();
        while(true){
            Integer inputNumbers = Integer.valueOf(scanner.nextLine());
            if (inputNumbers <= 0){
                break;
            }else {
            listaNumbers.add(inputNumbers);
            }//else
        }//while
        System.out.println(listaNumbers);
    }//main
}


/*
Tom
Emma
Alex
Mary

*/