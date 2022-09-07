
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days you would like to convert in seconds?");
        int First = Integer.valueOf(scanner.nextLine())*24 * 60 * 60;
       
        System.out.println(First);
    }
}
