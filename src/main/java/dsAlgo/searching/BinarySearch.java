package dsAlgo.searching;

import java.util.Arrays;

public class BinarySearch {
    /**
     *
     * This algorithm search element in a sorted array by
     * repeatedly dividing the search interval in half.
     * Begin with an interval covering the whole array.
     * If the value of the search key is less than the item in the middle of the interval,
     * narrow the interval to the lower half. Otherwise narrow it to the upper half.
     * Repeatedly check until the value is found or the interval is empty.
     *
     * Time Complexity: O(N*log N)
     * Auxiliary Space: O(1)
     *
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 11};
        int num = 2;
        int position = findNumUsingBinarySearch(arr,0, arr.length, num);
        if (position == -1)
            System.out.println("Element "
                    + "not present");
        else
            System.out.println("Element found"
                    + " at index "
                    + position);
    }


    private static int findNumUsingBinarySearch(int[] arr, int start, int end, int num) {


        if(end > start){
            int mid = start + (end - start) / 2;

            if(arr[mid] == num){
                return mid;
            } else if(arr[mid] > num){
                return findNumUsingBinarySearch(arr, start, mid, num);

            } else{
                return findNumUsingBinarySearch(arr, mid+1, end, num);
            }
        }

        return -1;

    }
}
