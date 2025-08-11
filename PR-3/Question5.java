import java.util.Scanner;

class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start Character\t:");
        char start = scanner.next().charAt(0);
        System.out.print("Enter end Character\t:");
        char end = scanner.next().charAt(0);

        do {
            System.out.print(start + " \t");
            start+=4;
        } while (start <= end);
    }

}
