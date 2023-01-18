package MultiDimensionArrays;

import java.util.Scanner;

/**
 * topRow => leftCol to rightCol
 * rightCol => topRow to bottomRow
 * bottomRow => rightCol to leftCol
 * leftCol => bottomRow to topRow
 */

public class C8_GenerateSpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowCol;
        System.out.println("Enter row of square Matrix: ");
        rowCol = scanner.nextInt();

        int[][] spiralMatrix = CreateSpiralMatrix(rowCol);

        PrintMatrix(rowCol, spiralMatrix);

    }

    private static int[][] CreateSpiralMatrix(int row){
        int topRow = 0, bottomRow = row-1;
        int leftCol =0, rightCol = row-1;
        int currentNum = 1;
        int[][] matrix = new int[row][row];
        //top
        while (currentNum <= row*row){
            for (int j = leftCol; j <= rightCol && currentNum<=row*row ; j++) {
                matrix[topRow][j] = currentNum;
                currentNum++;
            }
            topRow++;

            for (int i= topRow; i<=bottomRow && currentNum<=row*row; i++){
                matrix[i][rightCol] = currentNum;
                currentNum++;
            }
            rightCol--;

            for (int j= rightCol; j>=leftCol && currentNum<=row*row; j--){
                matrix[bottomRow][j] = currentNum;
                currentNum++;
            }
            bottomRow--;

            for (int i= bottomRow; i>=topRow && currentNum<=row*row; i--){
                matrix[i][leftCol] = currentNum;
                currentNum++;
            }
            leftCol++;
        }
        return matrix;
    }
    private static void PrintMatrix(int row, int[][] matrix){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
