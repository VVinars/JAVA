import java.util.Scanner;

class Ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number \t:");
        int a = scanner.nextInt();
        System.out.print("enter second number \t:");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("the min value is\t:" + b);
        } else {
            System.out.println("thr min value is \t: " + a);
        }
        scanner.close();

    }

}