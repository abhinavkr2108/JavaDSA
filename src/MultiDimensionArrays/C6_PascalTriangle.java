package MultiDimensionArrays;

import java.util.Scanner;
/**
 * Example of Pascal's Triangle:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * Some Important Information:-
 * 1. First and last coloumn of each row is 1
 * 2. Number of Columns is not fixed(No. of col = No. of row+1)
 * 3. Formula for element at each place: a[i][j] = a[i-1][j] + a[i-1][j-1]
 */
public class C6_PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of rows for the Pascal's Triangle: ");
        num = scanner.nextInt();
        System.out.println("Pascal Triangle: ");
        PascalTriangle(num);
    }
    private static void PascalTriangle(int row){
        int[][] triangle = new int[row][];
        for (int i = 0; i < row; i++) {
            triangle[i] = new int[i+1]; //Number of col = no. of row+1
            triangle[i][0] = triangle[i][i] = 1; //First and last element of each row is 1

            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
            }
        }
        PrintPascalTriangle(triangle);
    }

    private static void PrintPascalTriangle(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
