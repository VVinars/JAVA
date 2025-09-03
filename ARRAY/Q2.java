
import java.util.Scanner;

class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter elements of row : ");
        int row = scanner.nextInt();

        System.out.print("Enter elements of columb : ");
        int col = scanner.nextInt();

        int[][] A = new int[row][col];

        int B[][] = new int[row][col];

        int sum[][] = new int[row][col];

        System.out.println("Enter elements of Array A ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        System.out.println("Enter elements of Array B");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                B[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum[i][j] = A[i][j] + B[i][j];
            }

        }
        System.out.println("Sum of Array A and Array B");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(sum[i][j] +" ");
            }
            System.out.println("");

        }
    }
}
