
import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter any number");
        int number = scanner.nextInt();

        int originalNumber = number;
        int reversed = 0;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        int sum = 0;
        int position = 1;
        number = reversed;

        while (number > 0) {
            int digit = number % 10;
            int power = 1;

            for (int i = 1; i <= position; i++) {
                power *= digit;
            }

            sum += power;
            number /= 10;
            position++;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Disarium number.");
        } else {
            System.out.println(originalNumber + " is not a Disarium number.");
        }
    }
}
