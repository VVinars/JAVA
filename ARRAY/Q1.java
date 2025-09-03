
import java.util.Scanner;

class Q1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of row : ");
        int row = scanner.nextInt();

        System.out.print("Enter elements of columb : ");
        int col = scanner.nextInt();
        int[][] A = new int[row][col];
        float  AVG;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
            System.out.println("");
        }
        float sum=0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum += A[i][j] ;
                
            }

        }
        AVG= sum/(row*col);
        System.out.println(AVG);
        
    }

}
