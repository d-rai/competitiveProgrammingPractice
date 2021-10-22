package basic;


import java.util.Arrays;
import java.util.List;

public class MatrixDiagonalDifference {
    public static void main(String[] args) {
        int[][] arr = {{2,3,1},{23,12,11},{11,20,23}};

        System.out.println(difference(arr, arr.length));
        // print multi-dimension array
        /**
         * If the array contains other arrays as elements,
         * the string representation contains their contents and so on.
         * This method is designed for converting multidimensional arrays to strings.
         */
        System.out.println(Arrays.deepToString(arr));
        printMultiDimensionArray(arr);


    }

    private static void printMultiDimensionArray(int[][] arr) {
        System.out.print("[");
        // 1st loop is for row
        for (int i = 0; i < arr.length; i++) {

            // this loop is for column, that's why condition will
            // check how many element is present in current row (arr[i].length)
            System.out.println("");
            System.out.print("{");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("}");
            if(i<arr.length-1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    private static int difference(int[][] arr, int length) {
        int d1=0, d2=0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if(i == j)
                    d1 += arr[i][j];

                if(i == length-j-1)
                    d2 += arr[i][j];
            }
        }
        return Math.abs(d1-d2);
    }

    private static int digonalDifference(List<Integer> arr, int n) {
        int[][] a = (int[][]) arr.toArray();
        int d1=0, d2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i == j)
                    d1 += a[i][j];

                if(i == n-j-1)
                    d2 += a[i][j];
            }
        }
        return Math.abs(d1-d2);
    }
}
