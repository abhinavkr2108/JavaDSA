package Arrays;

public class C1_QuestionsPart1 {
    public static void main(String[] args) {
        Question1(); //Sum of array
        Question2(); // Max element in array
        Question3(); //Finding an element

    }

    private static void Question1(){
        /**
         * Program to find the sum of all the elements in an array
         * Array is statically typed
         */
        int example1[] = {15, 33, 55, 70, 96};
        int sum =0;

        for (int i=0; i< example1.length; i++){
            sum = sum + example1[i];
        }

        System.out.println("Sum of all elements in array is "+sum);
    }

    private static void Question2(){
        /**
         * Program to find the maximum element in an array
         * Array is statically typed
         */
        int example2[] = {15, 33, 55, 100, 96};
        int max = -1;

        for (int i=0; i< example2.length; i++){
            if (example2[i]>max){
                max = example2[i];
            }
        }

        System.out.println("Maximum element is "+max);
    }

    private static void Question3(){
        /**
         * Program to find a given element in an array
         * Element is present only once in the array
         */
        int example3[] = {15, 33, 55, 100, 96};
        int element = 35;
        int ans = -1;

        for (int i=0; i< example3.length; i++){
            if (example3[i]== element){
                ans = i;
                break;
            }
        }
        if (ans ==-1){
            System.out.println("Element not found ");
        }
        else {
            System.out.println("element found at index "+ans);
        }
    }
}
