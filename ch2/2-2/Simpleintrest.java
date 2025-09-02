import java.util.Scanner;

public class Simpleintrest {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter principal amount\t:");
        
        double principal = scanner.nextDouble();
        System.out.print("enter rate\t:");
        double rate = scanner.nextDouble();
         System.out.print("enter months\t:");
        double months = scanner.nextDouble();


        System.out.print("total interest\t:" + ( (principal * rate * months) / 100));
        scanner.close();

}
}
