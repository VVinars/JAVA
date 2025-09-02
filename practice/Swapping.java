import java.util.Scanner;

public class Swapping {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number\t: ");
        double a = scanner.nextDouble();
        System.out.print("Enter second number\t: ");
        double b= scanner.nextDouble();
        
       a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping:");
        System.out.println("First number\t: " + a);
        System.out.println("Second number\t: " + b);
        
        scanner.close();
    }
    
}

