package basic;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

public class ArrayEvenFinder {
    public static void main(String[] args) {
        int[] arr = {3, 7, 4, 6, 1, 9, 10, 8, 2};

        evenFinder(arr);
    }

    private static void evenFinder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0)
                System.out.println(arr[i]+" present at "+i+" index is even number.");

        }
    }
}
