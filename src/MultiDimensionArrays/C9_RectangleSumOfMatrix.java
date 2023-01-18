package MultiDimensionArrays;

import java.util.Scanner;

public class C9_RectangleSumOfMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col, x1, x2, y1, y2;
        System.out.println("Enter row and column of matrix: ");
        row = scanner.nextInt();
        col = scanner.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter your matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter first coordinates:");
        x1 = scanner.nextInt();
        y1 = scanner.nextInt();
        System.out.println("Enter second coordinates: ");
        x2 = scanner.nextInt();
        y2 = scanner.nextInt();

        int firstApproachSum = Approach1(matrix,x1, x2, y1, y2);
        System.out.println("Matrix sum by first Approach: "+firstApproachSum);

        int secondApproachSum = Approach2(matrix,x1, x2, y1, y2,row,col);
        System.out.println("Matrix sum by second Approach: "+secondApproachSum);
    }
    /**
     * First Approach :- Bruteforce Approach
     * Traverse through each row of the matrix
     */

    private static int Approach1(int[][] matrix, int x1, int x2, int y1, int y2){
        int sum =0;
        for (int i = x1; i <=x2 ; i++) {
            for (int j =y1; j<=y2; j++){
                sum = sum + matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Second Approach :- Using prefix sum
     * Calculate prefix sum for each row of the matrix
     */

    private static int Approach2(int[][] matrix, int x1, int x2, int y1, int y2, int row, int column){
        int sum =0;
        PrefixSum(matrix, row, column);
        for (int i= x1; i<=x2; i++){
            if (y1>0){
                sum += matrix[i][y2] - matrix[i][y1-1];
            }
            else {
                sum += matrix[i][y2];
            }
        }
        return sum;
    }

    private static void PrefixSum(int[][] matrix, int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 1; j < column; j++) {
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
}
