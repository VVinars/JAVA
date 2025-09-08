
import java.util.Scanner;

class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String : ");
        String Name = scanner.nextLine();
        boolean isPalindrome = true;
        int length = Name.length();
        for (int i = 0; i < length / 2; i++) {
            if (Name.charAt(i) != Name.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}



