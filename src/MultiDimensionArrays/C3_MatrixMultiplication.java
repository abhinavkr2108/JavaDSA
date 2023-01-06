package MultiDimensionArrays;

import java.util.Scanner;

public class C3_MatrixMultiplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int row1, row2, col1, col2;

        System.out.println("Enter rows & columns of First matrix:");
        row1 = scanner.nextInt();
        col1 = scanner.nextInt();
        System.out.println("Enter rows & columns of Second matrix:");
        row2 = scanner.nextInt();
        col2 = scanner.nextInt();

        if (col1!= row2){
            System.out.println("Invalid Input! Matrix Multiplication not possible");
            return;
        }

        int matrix1[][] = new int[row1][col1];
        int matrix2[][] = new int[row2][col2];

        System.out.println("Input first matrix elements: ");
        MatrixInput(matrix1,row1,col1);
        System.out.println("Input second matrix elements: ");
        MatrixInput(matrix2,row2,col2);

        System.out.println("Multiplication of the matrices is: ");
        MultiplyMatrix(matrix1,row1,col1,matrix2,row2,col2);

    }
    private static void MatrixInput(int array[][], int row, int col){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }
    private static void PrintMatrix(int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    private static void MultiplyMatrix(int array1[][], int row1, int col1, int array2[][], int row2, int col2){
        int multiplyMatrix[][] = new int [row1][col2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                for (int k = 0; k < row2; k++) {
                    multiplyMatrix[i][j] += array1[i][k]*array2[k][j];
                }
            }
        }
        PrintMatrix(multiplyMatrix);
    }
}
