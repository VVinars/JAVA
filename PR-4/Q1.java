
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("a[" + i + "] =");
            a[i] = scanner.nextInt();
            System.out.println();
        }

        for (int i = 0; i < size; i++) {
            if (a[i] < 0) {
                System.out.println(a[i] + " is negative");

            }
        }
    }
}
