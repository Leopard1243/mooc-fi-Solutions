
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        

        System.out.println("Give a number:");
        
        
Scanner reader = new Scanner(System.in);

System.out.println("Enter the first string");
String first = reader.nextLine();
System.out.println("Enter the second string");
String second = reader.nextLine();

if (first == second) {
    System.out.println("The strings were the same!");
} else {
    System.out.println("The strings were different!");
}
    }
}


