
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
System.out.println("Give the first number:");
int FirstNumber = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int SecondNumber = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int ThirdNumber = Integer.valueOf(scanner.nextLine());
        
        
        
        
        double result = (Integer) (FirstNumber + SecondNumber + ThirdNumber) /3;
        
        
        
                 
        System.out.println("The average is " + (result));
    }
}
