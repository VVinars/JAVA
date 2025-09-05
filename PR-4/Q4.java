
import java.util.Scanner;

class Q4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of row : ");
        int row = scanner.nextInt();

        System.out.print("Enter elements of columb : ");
        int col = scanner.nextInt();
        int[][] A = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();

            }
            System.out.println("");

        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j] + " ");

            }
            System.out.println("\n\n");
        }
        System.out.println("Enter row number ");
        int rowNum = scanner.nextInt();
        System.out.println("Enter columb number ");
        int colNum = scanner.nextInt();
        int rowSum = 0;

        for (int j = 0; j < col; j++) {
            System.out.print(A[rowNum][j] + " ");
            rowSum += A[rowNum][j];
        }
        System.out.println("\nSum of row " + rowNum + " = " + rowSum);

        int colSum = 0;

        for (int i = 0; i < row; i++) {
            System.out.print(A[i][colNum] + " ");
            colSum += A[i][colNum];
        }
        System.out.println("\nSum of column " + colNum + " = " + colSum);

    }
}
