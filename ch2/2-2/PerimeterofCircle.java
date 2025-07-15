import java.util.Scanner;
public class PerimeterofCircle {
public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
      

        final double PI = 3.14;
        System.out.print("radius of circle\t:");
        double radius = scanner.nextDouble();
        System.out.println("perimeter of circle \t:"+ (2 * PI * radius));
        scanner.close();
    
}
}