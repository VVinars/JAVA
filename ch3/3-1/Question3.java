import java.util.Scanner;
 class Question3 {
 public static void main(String[] args) {
    //x^2+2xy+y^2
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of x\t: ");
    double x = sc.nextDouble();
    System.out.print("Enter value of y\t: ");
    double y = sc.nextDouble();

    System.out.println("The value of x^2 + 2xy + y^2 is: " + (x * x + 2 * x * y + y * y));
    sc.close();
 }
    
}
