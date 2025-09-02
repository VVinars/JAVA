import java.util.Scanner;

public class LeapYearsWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting year: ");
        int startYear = scanner.nextInt();

        System.out.print("Enter the ending year: ");
        int endYear = scanner.nextInt();

        System.out.println("Leap years between " + startYear + " and " + endYear + ":");
        int year = startYear;
        while (year <= endYear) {
            if (year % 4 == 0) {
                System.out.println(year);
            }
            year++;
        }
    }
}
