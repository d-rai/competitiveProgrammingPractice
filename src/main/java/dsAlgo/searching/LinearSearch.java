package dsAlgo.searching;

public class LinearSearch {

    /**
     *
     * The idea is to traverse the given array arr[]
     * and find the index at which the element is present.
     *
     * Time Complexity: O(N)
     * Auxiliary Space: O(1)
     */
    public static void main(String[] args) {
        int[] arr = {2,5,11,43,2};
        int num = 21;
        linearSearchANum(arr, num);
    }

    private static void linearSearchANum(int[] arr, int num) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println(num+" is present in the array at "+i+" position.");
                flag = true;
            }
        }
        if(!flag){
            System.out.println(num+" is not available in the array.");
        }
    }
}
