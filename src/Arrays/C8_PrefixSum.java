package Arrays;

import java.util.Arrays;

public class C8_PrefixSum {
    public static void main(String[] args) {
        Question1(); //Prefix Sum using new array
        Question2(); //Prefix Sum without using new array
    }

    /**
     * Q: Get prefix sum of an array using a new array
     * A: Make a new array prefix
     *    prefix[0] = arr[0]
     *    use formula prefix[i] = prefix[i-1]+arr[i]
     */
    private static void Question1(){
        int arr1[] = {1,2,3,4,5};
        int n = arr1.length;
        int prefixArray[] = new int[n];
        prefixArray[0] = arr1[0];
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr1));

        for (int i=1; i<n; i++){
            prefixArray[i] = prefixArray[i-1] + arr1[i];
        }
        System.out.println(Arrays.toString(prefixArray));
    }
    /**
     * Q: Get prefix sum of an array **without** using a new array
     * A: Use the following approach to make changes in the given array
     *    arr[1] = arr[0]+arr[1]
     *    arr[2] = arr[1]+arr[2]
     *    arr[n] = arr[n-1]+arr[n]
     */
    private static void Question2(){
        int arr2[] = {1,2,3,4,5};
        int n = arr2.length;
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(arr2));

        for (int i=1; i<n; i++){
            arr2[i] = arr2[i-1]+arr2[i];
        }
        System.out.println("Prefix Sum array: ");
        System.out.println(Arrays.toString(arr2));
    }

}
