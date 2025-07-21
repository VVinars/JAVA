
import java.util.Scanner;

public class NestedIFELSE002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first value\t:");
        int a = scanner.nextInt();
        System.out.print("Enter second value\t:");
        int b = scanner.nextInt();
        System.out.print("Enter third value\t:");
        int c = scanner.nextInt();
        System.out.print("Enter fourth value\t:");
        int d = scanner.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.print("first number is maximum");
                } else {
                    System.out.print("fourth number is maximum");
                }

            } else {
                if (c > d) {
                    System.out.println("Third number is the maximum " );
                } else {
                    System.out.println("Fourth number is the maximum " );
                }
            }

        } else {
            if (b > c) {
                if (b > d) {
                    System.out.print("second number is maximum");

                } else {
                    System.out.print("fourth number is maximum");

                }

            }
            else {
               if (c > d) {
                    System.out.println("Third number is the maximum " );
                } else {
                    System.out.println("Fourth number is the maximum " );
                }
            }

        }
        scanner.close();

    }
}
