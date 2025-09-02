import java.util.Scanner;

public class Triangle {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter length\t:");
        
        double lenGTH = scanner.nextDouble();
        System.out.print("enter breadth\t:");
        double breadTH = scanner.nextDouble();

        double a = 0.5;
        System.out.print("area of triangle is\t:" + ( a*(lenGTH * breadTH)));
        scanner.close();


    
}
}
