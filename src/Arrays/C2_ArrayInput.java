package Arrays;

import java.util.Scanner;

/**
 * Taking Arrays as an input from the user
 */
public class C2_ArrayInput {
    public static void main(String[] args) {
        ArrayAsAnInput();
        ArrayInputViaLoops();
        CopyArray();
        CopyArrayImprovement();
    }
    /**
     * Function 1: take each element of array as an input
     */
    private static void ArrayAsAnInput(){
        Scanner input = new Scanner(System.in);
        int arr[] = new int[3];
        // Taking each element as an input from the user
        System.out.println("Enter Array elements: ");
        arr[0] = input.nextInt();
        arr[1] = input.nextInt();
        arr[2] = input.nextInt();

        System.out.println("Elements entered are: "+arr[0]+ " "+ arr[1] + " "+ arr[2]);
    }

    /**
     * Function 2: take arrays as an input via loops
     */

    private static void ArrayInputViaLoops(){
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);
        //Taking input from user
        System.out.println("Enter the elements of Array: ");
        for (int i=0; i< array.length; i++){
            array[i] = sc.nextInt();
        }
        //Printing Array
        System.out.println("Printed Array is: ");
        PrintArray(array);
    }

    private static void PrintArray(int array[]){
        for (int i=0 ; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void CopyArray(){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        System.out.println("Enetr elements of first array: ");
        for (int i=0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Elements of First Array: ");
        PrintArray(arr1);
        int arr2[] = new int[5];
        arr2 = arr1;
        System.out.println("Elements of Copied Array: ");
        PrintArray(arr2);
        arr2[0] = 34;
        arr2[1] = 45;
        /**
         * Value is only changed in array 2
         * Change in value of array 2 also reflects in array 1
         * This is because only new copy of reference is made in the stack
         * The copied reference variable points to the same array in the heap
         */
        System.out.println("Elements of First Array after value change: ");
        PrintArray(arr1);
        System.out.println("Elements of Copied Array after value change: ");
        PrintArray(arr2);
    }

    private static void CopyArrayImprovement(){
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[5];
        System.out.println("Enetr elements of first array: ");
        for (int i=0; i< arr1.length; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Elements of First Array: ");
        PrintArray(arr1);
        /**
         * array.clone function prevents any value change in original array
         * value change is only reflected in copied array
         */
        int arr2[] = arr1.clone();
        System.out.println("Elements of Copied Array: ");
        PrintArray(arr2);
        arr2[0] = 34;
        arr2[1] = 45;
        System.out.println("Elements of First Array after value change: ");
        PrintArray(arr1);
        System.out.println("Elements of Copied Array after value change: ");
        PrintArray(arr2);
    }
}
