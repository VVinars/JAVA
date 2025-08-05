import java.util.Scanner;
class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int reminder = number % 10;
            reversed = reversed * 10 + reminder;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}