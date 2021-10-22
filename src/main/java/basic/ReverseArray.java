package basic;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {23,1,3,12,18,2};
        reverse(a);
    }

    private static void reverse(int[] arr){
        int start = 0, end = arr.length-1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
