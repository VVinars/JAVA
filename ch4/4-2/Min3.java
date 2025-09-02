import java.util.Scanner;

class Min3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first numbers: ");
        int a = scanner.nextInt();
        System.out.print("Enter second numbers: ");
        int b = scanner.nextInt();
        System.out.print("Enter third numbers: ");
        int c = scanner.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.print(a + "is minimum");

            } else {
                System.out.print(c + "is minimum");
            }

        } else {
            if (b < c) {
                System.out.print(b + "is minimum");
            } else {
                System.out.print(c + "is minimum");
            }
        }

    }
}
