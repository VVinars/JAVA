
import java.util.Scanner;

public class Min4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        int a = scanner.nextInt();
        System.out.print("Enter second numbers: ");
        int b = scanner.nextInt();
        System.out.print("Enter third numbers: ");
        int c = scanner.nextInt();
        System.out.print("Enter fourth numbers: ");
        int d = scanner.nextInt();

        if (a < b) {
            if (a < c) {
                if (a < d) {

                    System.out.print(a + "is minimum");
                } else {
                    System.out.print(d + "is minimum");
                }

            } else {
                if (c < d) {
                    System.out.print(c + "is minimum");

                } else {
                    System.out.print(d + "is minimum");
                }

            }

        } else {
            if (b < c) {
                if (b < d) {
                    System.out.print(b + "is minimum");

                } else {
                    System.out.print(d + "is minimum");
                }

            } else {
                if (c < d) {
                    System.out.print(c + "is minimum");

                } else {
                    System.out.print(d + "is minimum");
                }
            }
        }

    }
}
