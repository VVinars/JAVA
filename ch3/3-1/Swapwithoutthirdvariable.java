import java.util.Scanner;

public class Swapwithoutthirdvariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number\t: ");
        double a = sc.nextDouble();
        
        System.out.print("Enter second number\t: ");
        double b = sc.nextDouble();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
       
        a = a + b; // a now becomes the sum of both numbers
        b = a - b; // b becomes the original value of a
        a = a - b; // a becomes the original value of b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
        
        sc.close();
    }
    
}
