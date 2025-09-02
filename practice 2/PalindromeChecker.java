import java.util.Scanner;

 class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        scanner.close();
    }

}
