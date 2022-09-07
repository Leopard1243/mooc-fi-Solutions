
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give the first number:");
int FirstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int SecondNumber = Integer.valueOf(scanner.nextLine());
        
        
        
        
        System.out.println(FirstNumber + " + " + SecondNumber + " = " + (FirstNumber + SecondNumber));
        System.out.println(FirstNumber + " - " + SecondNumber + " = " + (FirstNumber - SecondNumber));
        System.out.println(FirstNumber + " * " + SecondNumber + " = " + (FirstNumber * SecondNumber));
        System.out.println(FirstNumber + " / " + SecondNumber + " = " + (1.0 * FirstNumber / SecondNumber));
    
    }
}
