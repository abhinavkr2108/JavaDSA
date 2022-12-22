package Arrays;

public class C4_QuestionsPart3 {
    public static void main(String[] args) {
        int arr1[]= {4,3,6,4,8,1};
        int arr2[]= {1,1,2,2,3};
        int arr3[]= {10,9,8,7,6,5};
        int arr4[]= {1,1,2,2,3,3};
        int targetSum= Question1(arr1,7);
        System.out.println("The target sum is "+targetSum);

        int unique = Question2(arr2);
        if (unique==-1){
            System.out.println("No unique element in array");
        }
        else {
            System.out.println("Unique Element: "+unique);
        }
        int secondMax = Question3(arr3);
        System.out.println("Second maximum element: "+secondMax);

        int repeat = Question4(arr4);
        System.out.println("First repeated value is: "+repeat);

    }

    /**
     * Target Sum: Take two loops for traversal
     *
     */
    private static int Question1(int array[], int element){
        int targetSum =0;

        for (int i=0; i< array.length;i++){
            for (int j=i+1; j< array.length;j++){
                if (array[i]+array[j]==element){
                    targetSum++;
                }
            }
        }
        return targetSum;
    }

    /**
     * Find Unique element in array(Array contains +ve integers only)
     * Take two loops for traversal. If two elements are same, mark position -1
     * Array contains only one unique element
     * Return position not containing -1
     */
    private static int Question2(int array[]){
        int ans = -1;
        for (int i=0; i< array.length; i++){
            for (int j=i+1; j< array.length; j++){
                if (array[i]==array[j]){
                    array[i] = -1;
                    array[j] = -1;
                }
            }
        }
        for (int i=0; i< array.length; i++){
            if (array[i]!= -1){
                ans = array[i];
            }
        }
        return ans;
    }

    /**
     * Q: Find Maximum Element in array without sort function
     * A: declare max = -infinity
     * Traverse through the array
     */
    private static int FindMax(int array[]){
        int max = Integer.MIN_VALUE;
        for (int i=0;i< array.length;i++){
            if (array[i]> max){
                max= array[i];
            }
        }
        return max;
    }

    /**
     * Q: Find second largest element in array without sort function
     * A: Find maximum element(s) and replace them with -infinity
     * Find the max element again
     */
    private static int Question3(int[] array){
        int max = FindMax(array);
        for (int i=0; i< array.length; i++){
            if (array[i]==max){
                array[i]= Integer.MIN_VALUE;
            }
        }
        int secondMax= FindMax(array);
        return secondMax;
    }

    /**
     * Q: Return the first repeating number from array
     * A: Take two loops and compare the values
     * Return on obtaining a value
     * @param array
     * @return
     */

    private static int Question4(int array[]){
        int repeat = -1;
        for (int i=0; i< array.length;i++){
            for (int j=i+1; j< array.length; j++){
                if (array[i]==array[j]){
                    return array[i];
                }
            }
        }
        return repeat;
    }
}
