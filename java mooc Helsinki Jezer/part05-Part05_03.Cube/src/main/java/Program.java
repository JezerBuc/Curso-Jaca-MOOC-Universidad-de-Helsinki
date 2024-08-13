
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int input = Integer.valueOf(scanner.nextLine());
        
        
        
        
        
        Cube x = new Cube(input);
        System.out.println(x.volume());
        System.out.println(x);

    }
}
