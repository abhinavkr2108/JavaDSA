package Arrays;

public class C5_QuestionsPart4 {
    public static void main(String[] args) {
        Question1(); //Swap variables using third variable
        Question2(); //Swap variables without third variable
        Question3(); //Reverse array using new array
        Question4(); //Reverse array without using new array
        Question5(); //Rotate array using new array
        Question6();
    }

    /**
     * Swap values using third variable
     */
    private static void Question1(){
        int a = 5;
        int b= 10;
        System.out.println("Values before swapping: "+ a+" , "+b);
        //Swap
        int temp =a;
        a = b;
        b= temp;
        System.out.println("Values after swapping: "+ a+" , "+b);
    }
    /**
     * Swap values without using third variable
     */

    private static void Question2(){
        int a = 5;
        int b= 10;
        System.out.println("Values before swapping: "+ a+" , "+b);
        //Swap
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values after swapping: "+ a+" , "+b);
    }
    /**
     * Reverse an array using a new Array
     */
    private static void Question3(){
        int arr1[] = {9,2,6,4,5};
        int arr2[] = new int[5];

        System.out.println("Original Array: ");
        PrintArray(arr1);
        int j =0;

        for (int i = arr1.length-1; i>=0; i--){
            arr2[j++] = arr1[i];
        }
        System.out.println("Reversed Array: ");
        PrintArray(arr2);
    }

    private static void PrintArray(int array[]){
        for (int i=0; i< array.length; i++){
            System.out.print(" "+array[i]);
        }
        System.out.println();
    }
    /**
     * Q: Reverse an array without using a new Array
     * A: Use two pointers one from beginning and one from end
     */
    private static void Question4(){
        int arr1[] = {11,10,9,8,7,6};
        System.out.println("Original Array: ");
        PrintArray(arr1);
        //swap function
        SwapArray(arr1);
        System.out.println("Reversed Array: ");
        PrintArray(arr1);
    }

    private static void SwapArray(int array[]){
        int i=0;
        int j= array.length-1;
        int temp;

        while(i<j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
    /**
     * Q: Rotate an array using a new Array
     * A: First half: n-k->n-1
     *    Second half: 0->n-k-1
     */

    private static void Question5(){
        int arr1[]= {1,2,3,4,5};
        int n = arr1.length;
        int arr2[] = new int[n];
        int k =104;
        k = k % arr1.length;
        System.out.println("Array before Rotating: ");
        PrintArray(arr1);

        int j=0;
        //First Half
        for (int i=n-k; i<n; i++){
            arr2[j++] = arr1[i];
        }
        //Second Half
        for (int i=0; i<n-k; i++){
            arr2[j++] = arr1[i];
        }

        System.out.println("Array after Rotating: ");
        PrintArray(arr2);
    }

    /**
     * Q: Rotate array without using new array
     * A: Reverse array from 0 -> n-k-1
     *    Reverse array from n-k -> n-1
     *    Reverse the complete array
     */

    private static void Question6(){
        int arr1[] = {1,2,3,4,5};
        int n = arr1.length;
        int k =103;
        k = k%n;
        System.out.println("Array before Rotating: ");
        PrintArray(arr1);

        ReverseArray(arr1,0,n-k-1);
        ReverseArray(arr1, n-k, n-1);
        ReverseArray(arr1,0,n-1);

        System.out.println("Array after Rotating: ");
        PrintArray(arr1);
    }
    private static void ReverseArray(int array[], int startIndex, int endIndex){
        int temp;
        while (startIndex<endIndex){
            temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex]= temp;
            startIndex++;
            endIndex--;
        }
    }
}
