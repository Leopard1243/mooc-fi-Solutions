
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");

        int input1 = Integer.valueOf(scan.nextLine());

        if ((input1 % 4 == 0) && (input1 % 100 != 0) || (input1 % 400 == 0)) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
