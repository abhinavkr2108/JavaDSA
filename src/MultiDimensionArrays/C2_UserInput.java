package MultiDimensionArrays;

import java.util.Scanner;

public class C2_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        System.out.println("Enter number of rows:");
        row = scanner.nextInt();
        System.out.println("Enter number of Columns: ");
        col = scanner.nextInt();

        int[][] array = new int[row][col];

        System.out.println("Enter elements of Array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Entered 2D Array is: ");
        PrintMultiArray(array);
    }


    private static void PrintMultiArray(int array[][]){
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
