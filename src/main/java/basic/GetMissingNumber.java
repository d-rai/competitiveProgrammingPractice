package basic;

public class GetMissingNumber {

    public static void main(String[] args) {
        int[] arr = {1,2,7,4,5,6,8,9,10};
        int n =10;
        System.out.println(findMissingNum(arr, n));
    }

    private static int findMissingNum(int[] arr, int n) {
        int totalSum = n*(n+1)/2;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += arr[i];
        }
        return totalSum - sum;
    }
}
