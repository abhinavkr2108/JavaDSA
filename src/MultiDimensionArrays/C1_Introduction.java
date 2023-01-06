package MultiDimensionArrays;

public class C1_Introduction {
    public static void main(String[] args) {

        int multiArray[][] = {
                                {1,2},
                                {3,4},
                                {5,6}
                              };

        PrintMultiArray(multiArray);

    }

    private static void PrintMultiArray(int array[][]){
        for (int i=0; i< array.length; i++){
            for (int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
