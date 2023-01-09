package MultiDimensionArrays;

import java.util.Scanner;

public class C4_MatrixTranspose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Enter the number rows and columns of matrix: ");
        row = scanner.nextInt();
        col = scanner.nextInt();

        System.out.println("Enter Elements of the Matrix: ");
        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Matrix: ");
        PrintMatrix(matrix, row, col);

        System.out.println("Transpose Matrix: ");
        MatrixTranspose(matrix,row,col);
    }

    private static void PrintMatrix(int matrix [][], int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void MatrixTranspose(int matrix [][], int row, int column){
        int transposeMatrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        PrintMatrix(transposeMatrix,row,column);
    }
}
