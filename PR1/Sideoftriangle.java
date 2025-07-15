import java.util.Scanner;

public class Sideoftriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("angle 1  of the triangle\t: ");
        double angle1 = scanner.nextDouble();
        System.out.print("angle 2  of the triangle\t: ");
        double angle2 = scanner.nextDouble();
        double angle3 = 180 - (angle1 + angle2);
        System.out.print("angle 3 of the triangle\t:" + angle3);

        scanner.close();
    }
}