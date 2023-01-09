package Arrays;

import java.util.Arrays;

public class C7_TwoPointers {
    public static void main(String[] args) {
        Question1(); //Sort 0s and 1s using Brute Force Algorithm
        Question2(); //Sort 0s and 1s using two pointers
        Question3(); //Arrays with odd numbers first followed by even numbers
        Question4(); //Non decreasing sorted square array
    }

    /**
     * Some useful functions:
     */
    private static void PrintArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void ReverseArray(int array[], int startIndex, int endIndex) {
        int temp;
        while (startIndex < endIndex) {
            temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
    }

        /**
         * Q: Sort array containing 0s and 1s using Brute Force Approach
         * A: Count number of zeroes and place them in beginning
         */
        private static void Question1() {
            int arr1[] = {1, 0, 0, 1, 1, 0, 0, 1};
            int n = arr1.length;
            int countZero = 0;
            System.out.println("Original Array: ");
            PrintArray(arr1);

            for (int i = 0; i < n; i++) {
                if (arr1[i] == 0) {
                    countZero++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (i < countZero) {
                    arr1[i] = 0;
                } else {
                    arr1[i] = 1;
                }
            }
            System.out.println("Sorted Array: ");
            PrintArray(arr1);
        }

        /**
         * Q: Sort array containing 0s and 1s using two pointers
         * A: Take two pointers starting from beginning and end
         *    Swap the numbers if there is 1 at starting and 0 at end
         *    If they are at correct position: start++ and end--
         */
        private static void Question2 () {
            int arr2[] = {1, 0, 0, 1, 1, 0, 0, 1};
            int n = arr2.length;
            int start = 0;
            int end = n - 1;
            System.out.println("Original Array: ");
            PrintArray(arr2);

            while (start < end) {
                if (arr2[start] == 1 && arr2[end] == 0) {
                    int temp = arr2[start];
                    arr2[start] = arr2[end];
                    arr2[end] = temp;
                    start++;
                    end--;
                }

                if (arr2[start] == 0) {
                    start++;
                }
                if (arr2[end] == 1) {
                    end--;
                }
            }

            System.out.println("Sorted Array: ");
            System.out.println(Arrays.toString(arr2));
        }

        private static void Question3 () {
            int arr3[] = {1, 2, 3, 4, 5, 6, 7, 8};
            int n = arr3.length;
            int start = 0;
            int end = n - 1;
            System.out.println("Original Array: ");
            PrintArray(arr3);

            while (start < end) {
                if (arr3[start] % 2 == 0 && arr3[end] != 0) {
                    int temp = arr3[start];
                    arr3[start] = arr3[end];
                    arr3[end] = temp;
                    start++;
                    end--;
                }

                if (arr3[start] % 2 != 0) {
                    start++;
                }
                if (arr3[end] % 2 == 0) {
                    end--;
                }
            }
            System.out.println("Array with odd numbers first followed by even numbers:");
            System.out.println(Arrays.toString(arr3));
        }

        private static void Question4() {
            int arr4[] = {-10,-9,1,2,3,4,5};
            int n = arr4.length;
            int start = 0;
            int end = n-1;
            int ans[] = new int[n];
            int k=0;
            System.out.println("Original Array: ");
            PrintArray(arr4);

            while (start<=end){
                if (Math.abs(arr4[start]) > Math.abs(arr4[end])){
                    ans[k++] = arr4[start]*arr4[start];
                    start++;
                }
                else {
                    ans[k++] = arr4[end]*arr4[end];
                    end--;
                }
            }

            System.out.println("Non-decreasing sorted square array: ");
            ReverseArray(ans,0,ans.length-1);
            PrintArray(ans);
        }
    }


