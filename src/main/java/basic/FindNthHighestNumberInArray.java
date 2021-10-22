package basic;

import java.util.Arrays;

public class FindNthHighestNumberInArray {
    public static void main(String[] args) {
        int[] arr = {12,43,1,67,98,8,6};
        int n = 3;
        System.out.println(nthHighestNumberIs(arr, n));
    }

    private static int nthHighestNumberIs(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[arr.length -n];
    }

    private static int nthLowestNumberIs(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
