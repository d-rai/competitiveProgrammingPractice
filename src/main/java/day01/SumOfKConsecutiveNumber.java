package day01;

public class SumOfKConsecutiveNumber {
    public static void main(String[] args) {
        int[] a = {1,23,2,33,56,-2,96,15};
        int k = 2;
        //simpleApproach(a, k);
        throughWindowSlidingTechnique(a, k);
    }

    private static void throughWindowSlidingTechnique(int[] a, int k) {

        int currentWindow=0;

        for (int i = 0; i < k; i++) {
            currentWindow +=a[i];
        }

        int maxSum = currentWindow;
        for (int i = k; i < a.length; i++) {
            currentWindow += a[i] - a[i-k];
            maxSum = Math.max(currentWindow, maxSum);
        }

        System.out.println(maxSum);

    }

    private static void simpleApproach(int[] a, int k) {
        int maxSum = 0;
        for (int i = 0; i+k-1 < a.length; i++) {
            int sum=0;
            for (int j = 0; j < k; j++) {
                sum +=a[i+j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }

}
