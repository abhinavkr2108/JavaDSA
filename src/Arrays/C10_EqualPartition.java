package Arrays;

import java.util.Scanner;

public class C10_EqualPartition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array: ");
        n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter elements of array: ");
        for (int i=0; i< array.length; i++){
            array[i] = scanner.nextInt();
        }

        Boolean ans = CheckEqualPartition(array);
        System.out.println(ans);
    }

    private static int ReturnSum(int array[]){
        int sum =0;
        for (int i=0; i< array.length; i++){
            sum = sum+ array[i];
        }
        return sum;
    }

    private static Boolean CheckEqualPartition(int array[]){
        int totalSum = ReturnSum(array);

        for (int i=1; i<array.length; i++){
            int prefixSum = array[i-1]+array[i];
            int suffixSum = totalSum - prefixSum;

            if (prefixSum==suffixSum){
                return true;
            }
        }
        return false;
    }
}
