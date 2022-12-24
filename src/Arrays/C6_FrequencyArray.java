package Arrays;

import java.util.Scanner;

public class C6_FrequencyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n; int q;
        System.out.println("Enter Size of Array(Less than 100000): ");
        n = input.nextInt();
        int array[] = new int[n];
        for (int i=0; i<array.length; i++){
            System.out.println("Enter Element "+i );
            array[i] = input.nextInt();
        }
        int freq[]= MakeFrequencyArray(array);
        
        System.out.println("How many elements do you want to search?: ");
        q = input.nextInt();

        while (q>0){
            System.out.println("Enter element to be searched: ");
            int x= input.nextInt();
            if (freq[x]> 0){
                System.out.println("Element found in array");
            }
            else {
                System.out.println("Element not found in array");
            }
            q--;
        }


    }
    private static int[] MakeFrequencyArray(int array[]){
        int freqArray[] = new int[10005];

        for (int i=0; i< array.length; i++){
            freqArray[array[i]]++;
        }
        return freqArray;
    }
}
