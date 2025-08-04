import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");

        } if (number % 5 == 0) {
            System.out.println("The number is divisible by 5.");
        } else {
            System.out.println("The number is not divisible by 5.");

        }
        

    }
    
}
