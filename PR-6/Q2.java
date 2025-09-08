
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String Name = scanner.nextLine();

        for (int i = 0; i < Name.length(); i++) {
            char ch = Name.charAt(i);
            int count = 0;

            
            for (int j = 0; j < Name.length(); j++) {
                if (Name.charAt(j) == ch) {
                    count++;
                }
            }

           
            boolean alreadyCounted = false;
            for (int k = 0; k < i; k++) {
                if (Name.charAt(k) == ch) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                System.out.println(ch + " = " + count);
            }
        }


    }
}
