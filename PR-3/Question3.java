import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("enter any number:");
        int a = scanner.nextInt();
        while (a >= 10) {
            int sum = 0;
            while (a != 0) {
                sum += a % 10;
                a /= 10;
            }
            a = sum;
        }

        System.out.println("Single digit sum: " + a);
    }
}
