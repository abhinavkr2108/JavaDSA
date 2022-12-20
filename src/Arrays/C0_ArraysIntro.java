package Arrays;

public class C0_ArraysIntro {
    public static void main(String[] args) {
        /* Defining an array */
        int[] ages = new int[3];

        // Assigning Values to Array indexes
        ages[0] = 5;
        ages[1] = 10;
        ages[2] = 15;

        // Printing the array
        System.out.println("Age at index 0: "+ages[0]);
        System.out.println("Age at index 1: "+ages[1]);
        System.out.println("Age at index 2: "+ages[2]);

        //Size of Array
        System.out.println("Length of Array is " +ages.length);

        printArrayThroughLoop();
    }

    static void printArrayThroughLoop(){
        int array[] = new int[5];
        array[0]= 5;
        array[1]= 10;
        array[2]= 15;
        array[3]= 20;
        array[4]= 25;

        for (int i=0; i< array.length; i++){
            System.out.println("Element at index "+ i + " is "+array[i]);
        }
    }
}
