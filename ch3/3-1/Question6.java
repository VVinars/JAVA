import java.util.Scanner;
 class Question6 {
 public static void main(String[] args) {
   //x^3 - 3x^2y + 3xy^2 - y^3
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of x\t: ");
    double x = sc.nextDouble();
    System.out.print("Enter value of y\t: ");
    double y = sc.nextDouble();

    System.out.println("The value of x^3 - 3x^2y + 3xy^2 - y^3): " + (x * x * x - 3 * x * x * y + 3 * x * y * y - y * y * y));
    sc.close();
 }
    
}
    
