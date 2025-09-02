import java.util.Scanner;

public class Neutral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the value\t: ");
        long a = scanner.nextLong();

        if (a <= -1) {
            System.out.println("the number is negative");
        }

        else if (a >= 1) {
            System.out.println("the number is positive\t");

        } else {
            System.out.println("the number is neutral");
        }
        scanner.close();
    }

}
