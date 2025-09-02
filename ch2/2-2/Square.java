
import java.util.Scanner;

class Square {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("length of square\t:");
        double lenGTH = scanner.nextDouble();

        System.out.print("area of square is\t:" + (lenGTH * lenGTH));
        scanner.close();

    }

}
