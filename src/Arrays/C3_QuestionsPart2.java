package Arrays;

import java.util.Arrays;

public class C3_QuestionsPart2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 33, 5, 8, 55, 32, 5, 9};
        int[] arr2 = {1, 2, 2, 3, 3, 4, 5};
        int count = Question1(arr1,90);
        System.out.println("Element occured "+ count+" times");

        int index = Question2(arr1, 90);
        if (index==-1){
            System.out.println("Element didn't occur");
        }
        else {
            System.out.println("Last index is "+ index);
        }
        int greaterElement = Question3(arr1, 5);
        System.out.println("Number of elements greater than the number are "+ greaterElement);

        boolean check = Question4(arr2);
        if (check==true){
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }
        int sortedArray[] = Question5(arr1);
        int minimum = arr1[0];
        int maximum = arr1[arr1.length-1];
        System.out.println("Minimum Element: "+minimum);
        System.out.println("Maximum Element: "+maximum);

    }

    /**
     * Count the number of occurrences of a particular element x
     */
    private static int Question1(int array[], int element){
        int count =0;
        for (int i=0; i< array.length; i++){
            if (array[i]==element){
                count++;
            }
        }
        return count;
    }
    /**
     * Find Last Index of element x
     */
    private static int Question2(int array[], int element){
        int index = -1;
        for (int i=0; i< array.length; i++){
            if (array[i]==element){
                index=i;
            }
        }
        return index;
    }
    /**
     * Count the number of elements greater than a particular element x
     */
    private static int Question3(int array[], int element){
        int greaterElement = 0;
        for (int i=0; i< array.length; i++){
            if (array[i]>element){
                greaterElement++;
            }
        }
        return greaterElement;
    }

    /**
     *Check whether a given array is sorted or not
     */
    private static boolean Question4(int array[]){
        boolean check = true;
        for (int i=1; i< array.length; i++){
            if (array[i]<array[i-1]){
                check = false;
                break;
            }
        }
        return check;
    }

    private static int[] Question5(int array[]){
        Arrays.sort(array);
        return array;
    }
}
