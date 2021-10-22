package basic;

public class FindMaxAndMinOfArray {

    public static void main(String[] args) {
        int[] arr = {12,43,1,67,98,8,6};
        System.out.println(maxNumIs(arr));
        System.out.println(minNumIs(arr));
    }


    private static int maxNumIs(int[] arr) {
        int max = arr[0], i=0;
        while (i < arr.length){
            max = Math.max(max,arr[i]);
            i++;
        }
        return max;
    }

    private static int minNumIs(int[] arr) {
        int min = arr[0], i=0;
        while (i < arr.length){
            min = Math.min(min,arr[i]);
            i++;
        }
        return min;
    }
}
