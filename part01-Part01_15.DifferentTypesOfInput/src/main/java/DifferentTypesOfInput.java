
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
System.out.println("Give a string:");
String string = scan.nextLine();

        System.out.println("Give an integer:");
        int ineger = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean");
        boolean booan = Boolean.valueOf(scan.nextLine());
        
        System.out.println(string);
        System.out.println(ineger);
        System.out.println(booan);
        
    }
}
