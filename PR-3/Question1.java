import java.util.Scanner;

class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int number = scanner.nextInt();
        int a = 1;
        int b = 1;

        for (int i = 1; i <= number; i++) {
            System.out.print(a + "\t ");
            a += b;
            b++;

        }

    }
}