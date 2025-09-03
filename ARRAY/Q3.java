import java.util.Scanner;

class Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of row : ");
        int row = scanner.nextInt();

        System.out.print("Enter elements of columb : ");
        int col = scanner.nextInt();
        int[][] A = new int[row][col];
        int Sum=0;
     

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }

         for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i==j) {
                    Sum += A[i][j];

                    
                }
            }
           
        }
        System.out.print("Sum of diagonal elements is :"+ Sum);
    }
}