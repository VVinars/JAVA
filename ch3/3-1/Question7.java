import java.util.Scanner;
 class Question7 {
 public static void main(String[] args) {
   //x^2+y^2+z^2+2xy+2yz+2xz
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of x\t: ");
    double x = sc.nextDouble();
    System.out.print("Enter value of y\t: ");
    double y = sc.nextDouble();
    System.out.print("Enter value of z\t: ");
    double z = sc.nextDouble();

    System.out.println("The value of x^2+y^2+z^2+2xy+2yz+2xz: " +
                       (x * x + y * y + z * z + 2 * x * y + 2 * y * z + 2 * x * z));
    sc.close();
 }
    
}
    
