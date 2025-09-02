
import java.util.Scanner;


class Circle{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        // formula for area of circle pi * r * r

        final double PI = 3.14;
        System.out.print("radius of circle\t:");
        double radius = scanner.nextDouble();
        System.out.println("Area of circle \t:"+ (PI*(radius*radius)));
        scanner.close();


    }
}

