
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int input = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number");
        int input2 = Integer.valueOf(scan.nextLine());

        if (input > input2) {
            System.out.println(input);
        } else if (input < input2) {
            System.out.println(input2);
        } else {
            System.out.println("The numbers are equal");
        }
    }
}
