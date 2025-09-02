
import java.util.Scanner;

class SimpleGradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner scanner = new Scanner(System.in);
        int Marks = scanner.nextInt();
        char grade = (Marks >= 90) ? 'A' :
                     (Marks >= 80) ? 'B' :
                     (Marks >= 70) ? 'C' :
                     (Marks >= 60) ? 'D' : 'F';
        if (Marks >= 90) {
            System.out.println("Your grade is A Excellent");
        } 
        else if (Marks >= 80) {
            System.out.println("Your grade is B Excellent Well done");
        } else {
            System.out.println("Keep trying");
        }
    }
}