import java.util.Scanner;

public class Swapwiththirdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number\t: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter second number\t: ");
        double b = sc.nextDouble();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Using a third variable to swap
        double c = a + b;//c= 30
        b = c - b;//b= 30 - 20 = 10
        a = c - a;// a= 30 - 10 = 20

        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        sc.close();
    }
}
