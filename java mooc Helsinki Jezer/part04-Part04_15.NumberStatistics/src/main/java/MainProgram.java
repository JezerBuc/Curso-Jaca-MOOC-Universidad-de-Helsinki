
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Statistics estadistica = new Statistics();
        Statistics numPares = new Statistics();
        Statistics numImpares = new Statistics();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                
                break;
            } else {
                estadistica.addNumber(input);
                if (input % 2 == 0) {
                    numPares.addNumber(input);
                } else {
                    numImpares.addNumber(input);
                }//else
            }//if else

        }//while
        System.out.println("sum: " + estadistica.sum());
        System.out.println("Sum of even numbers: " + numPares.sum());
        System.out.println("Sum of odd numbers: " + numImpares.sum());

    }
}

        /*
        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
*/
