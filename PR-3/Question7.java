import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int lastDigit = num % 10; 
        int firstDigit = num;

       
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = firstDigit + lastDigit;

        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
        System.out.println("Sum of first and last digit: " + sum);
    }
}
