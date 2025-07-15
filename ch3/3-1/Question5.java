import java.util.Scanner;
 class Question5 {
 public static void main(String[] args) {
   //x^3+y^3+3xy(x+y)
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of x\t: ");
    double x = sc.nextDouble();
    System.out.print("Enter value of y\t: ");
    double y = sc.nextDouble();

    System.out.println("The value of x^3+y^3+3xy(x+y): " + (x * x * x + y* y * y + 3 * x * y* (x + y)));
    sc.close();
 }
    
}
    
