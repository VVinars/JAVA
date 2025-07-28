import java.util.Scanner;

class Grosssalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter basic salary\t: ");
        double basicSalary = scanner.nextDouble();

        double hra = 10;
        double da = 5;
        double ta = 8;

        hra = basicSalary * hra / 100;
        da = basicSalary * da / 100;
        ta = basicSalary * ta / 100;
        

        double grossSalary = basicSalary + hra + da + ta;

        System.out.print("Gross Salary\t:" + grossSalary);

        scanner.close();
    }

}
