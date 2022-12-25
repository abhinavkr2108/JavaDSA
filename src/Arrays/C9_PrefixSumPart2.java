package Arrays;

import java.util.Scanner;

public class C9_PrefixSumPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, choice, start, end;
        System.out.println("Enter Size of Array: ");
        n = scanner.nextInt();

        int array[] = new int[n+1];
        System.out.println("Enter the elements of array: ");
        for (int i=1; i<n+1; i++){
            array[i] = scanner.nextInt();
        }
        int prefixArray[] = PrefixSum(array);

        System.out.println("Enter number of choices: ");
        choice = scanner.nextInt();

        while (choice>0){
            System.out.println("Enter starting index: ");
            start = scanner.nextInt();
            System.out.println("Enter ending index: ");
            end = scanner.nextInt();

            int sum = array[end]-array[start-1];
            System.out.println("Sum from starting to end index is: "+sum);
            choice--;
        }

    }

    private static int[] PrefixSum(int array[]){
        int n = array.length;
        for (int i = 1; i<n; i++){
            array[i] = array[i-1]+ array[i];
        }
        return array;
    }

}
