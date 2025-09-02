import java.util.Scanner;

public class LoopNto1odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int i = 1;
        while (n >= 1) {

            if (n % 2 != 0) {
                System.out.println(n);
            }
            n--;
        }
       
    }

}
