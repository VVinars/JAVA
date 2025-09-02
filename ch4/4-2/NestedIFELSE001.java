import java.util.Scanner;

class NestedIFELSE001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first value \t:");
        int Num1 = scanner.nextInt();
        System.out.print("enter second value \t:");
        int Num2 = scanner.nextInt();
        System.out.print("enter third value \t:");
        int Num3 = scanner.nextInt();

        if (Num1 > Num2) {
            if (Num1 > Num3) {
                System.out.println("First number is maximum");
            } else {
                System.out.println("Third number is maximum");
            }

        } else {
            if (Num2 > Num3) {
                System.out.print("Second Number is maximum ");
            } else {
                System.out.println("Third number is maximum");
            }

        }

        scanner.close();


    }

}
