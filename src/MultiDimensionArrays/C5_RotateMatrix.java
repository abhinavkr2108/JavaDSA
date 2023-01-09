package MultiDimensionArrays;

import java.util.Scanner;

/**
 * Program to rotate a Matrix by 90 degree
 * 1 2 3    7 4 1
 * 4 5 6 => 8 5 2
 * 7 8 9    9 6 3
 * Approach :-
 * Step1: Find transpose of the matrix
 * 1 4 7
 * 2 5 8
 * 3 6 9
 * Step2: Reverse each row of the matrix
 * 7 4 1
 * 8 5 2
 * 9 6 3
 */
public class C5_RotateMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Enter number of rows and columns: ");
        row = scanner.nextInt();
        col = scanner.nextInt();
        int matrix[][] = new int[row][col];
        System.out.println("Enter elements of matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        PrintMatrix(matrix, row, col);

        MatrixTranspose(matrix,row,col);

        System.out.println("Rotated Matrix: ");
        RotateMatrix(matrix, row,col);


    }
    private static void PrintMatrix(int matrix[][], int row, int column){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] MatrixTranspose(int[][] matrix, int row, int column){
        int transposeMatrix[][] = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeMatrix[i][j] = matrix[j][i];
            }
        }
        return transposeMatrix;
    }
    private static void ReverseRowOfMatrix(int[] array){
        int i=0, n= array.length-1;
        while (i<n){
            int temp = array[i];
            array[i] = array[n];
            array[n] = temp;
            i++;
            n--;
        }
    }
    private static void RotateMatrix(int matrix[][], int row, int column){

        int transpose[][] = MatrixTranspose(matrix,row,column);

        for (int i = 0; i < row; i++) {
            ReverseRowOfMatrix(transpose[i]);
        }

        PrintMatrix(transpose,row,column);
    }
}
