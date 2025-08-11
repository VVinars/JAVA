import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int count = 0;

        if (num == 0) {
            count = 1; 
        } else {
            if (num < 0) {
                num = -num; 
            }

            while (num != 0) {
                num = num / 10; 
                count++; 
            }
        }

        System.out.println("Total number of digits: " + count);
    }
}
