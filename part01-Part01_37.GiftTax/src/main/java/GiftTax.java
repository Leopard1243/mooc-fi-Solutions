
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the Gift?");

        int gift1 = Integer.valueOf(scan.nextLine());

        double gifttax1 = (100 + (gift1 - 5000) * 0.08);
        double gifttax2 = (1700 + (gift1 - 25000) * 0.10);
        double gifttax3 = (4700 + (gift1 - 55000) * 0.12);
        double gifttax4 = (22100 + (gift1 - 200000) * 0.15);
        double gifttax5 = (142100 + (gift1 - 1000000) * 0.17);

        if (gift1 < 5000) {
            System.out.println("No tax!");
        } else if (gift1 >= 5000 && gift1 <= 25000) {
            System.out.println(" Tax: " + gifttax1);
        } else if (gift1 >= 25000 && gift1 <= 55000) {
            System.out.println(" Tax " + gifttax2);
        } else if (gift1 >= 55000 && gift1 <= 200000) {
            System.out.println(" Tax " + gifttax3);
        } else if (gift1 >= 200000 && gift1 <= 1000000) {
            System.out.println(" Tax " + gifttax4);
        } else if (gift1 >= 1000000) {
            System.out.println(" Tax " + gifttax5);
        }

    }
}
