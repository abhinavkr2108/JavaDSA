package MultiDimensionArrays;

import java.util.Scanner;

/**
 *
 * topRow => leftCol to rightCol
 * rightCol => topRow to bottomRow
 * bottomRow => rightCol to leftCol
 * leftCol => bottomRow to topRow
 */

public class C7_SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        System.out.println("Enter Number of Rows and Columns: ");
        row = scanner.nextInt();
        col = scanner.nextInt();

        int matrix[][] = new int[row][col];

        System.out.println("Enter your Matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Spiral order Matrix: ");
        SpiralMatrix(matrix, row,col);

    }

    private static void SpiralMatrix(int[][] Matrix, int row, int column){
        int topRow = 0, bottomRow = row-1;
        int leftCol = 0, rightCol = column-1;
        int totalElements =0;
        while (totalElements<row*column){
            for (int j = leftCol; j <= rightCol && totalElements<row*column; j++) {
                System.out.print(Matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            for (int i = topRow; i <= bottomRow && totalElements<row*column; i++) {
                System.out.print(Matrix[i][rightCol] +" ");
                totalElements++;
            }
            rightCol--;
            for (int j = rightCol; j >= leftCol && totalElements<row*column; j--) {
                System.out.print(Matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;

            for (int i = bottomRow; i >= topRow && totalElements<row*column; i--) {
                System.out.print(Matrix[i][leftCol]+" ");
                totalElements++;
            }
            leftCol++;

        }
    }
}

